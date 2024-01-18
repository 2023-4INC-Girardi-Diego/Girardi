/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifca2;

import data.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author S51verifica06
 */
public class Studente extends Persona {

    private final String scuola = "I.T.T Buonarroti";
    private int classe;
    private boolean isRipetente;
    private ArrayList<Float> voti;

    public Studente(String cognome, String nome, Data dataDiNascita, int classe, boolean ripetente) throws Exception {
        super(cognome, nome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(ripetente);
    }

    public Studente() {
        super();
    }

    public void setClasse(int classe) throws Exception {
        if (classe < 1 || classe > 5) {
            throw new Exception("Classe non esistente");
        } else {
            this.classe = classe;
        }
    }

    public void setIsRipetente(boolean isRipetente) {
        this.isRipetente = isRipetente;
    }

    public void setVoti(ArrayList<Float> voti) {
        this.voti = voti;
    }

    public int getClasse() {
        return classe;
    }

    public boolean verificaOmonimia(Studente studente) {

        boolean omonimia = false;

        if (super.verificaOmonimia(studente) == true && this.classe == studente.getClasse()) {
            omonimia = true;
        }

        return omonimia;
    }

    public void aggiungiVoto(Float voto) throws Exception {
        this.voti.add(voto);
    }

    public void rimuoviVoto(Float voto) throws Exception {

        int i = 0;

        while (i < this.voti.size() && !this.voti.get(i).equals(voto)) {
            i++;
        }

        if (i < this.voti.size()) {

            this.voti.remove(i);
        } else {

            throw new Exception("Voto non trovato");
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione >= 0 && posizione < this.voti.size()) {
            this.voti.remove(posizione);
        } else {
            throw new Exception("Posizione non valida");
        }
    }

    public void rimuviUltimoVoto() {
        if (!this.voti.isEmpty()) {
            this.voti.remove(this.voti.size() - 1);
        }
    }

    //utilizzo comparator che permette di mettere in ordine naturale tutti i numeri
    public float votoMinore() {
        this.voti.sort(Comparator.naturalOrder());
        return this.voti.get(0);
    }

    public float votoMagggiore() {
        this.voti.sort(Comparator.naturalOrder());
        return this.voti.get(this.voti.size() - 1);
    }

    public float mediaVoti() {

        float media = 0;
        float somma = 0;

        for (int i = 0; i < this.voti.size(); i++) {
            somma += this.voti.get(i);
        }

        media = somma / this.voti.size();

        return media;

    }

    public void ordinaVotoCrescente() {
        this.voti.sort(Comparator.naturalOrder());
    }

    public void ordinaVotoDecrescente() {
        this.voti.sort(Comparator.reverseOrder());
    }

    public boolean promuovi() throws Exception {
        int promozione = this.classe + 1;
        if (promozione > 5 || promozione < 1) {
            return false;
        } else {
            this.classe = promozione;
            return true;
        }
    }

    public boolean promuovi(int classi) throws Exception {
        int promozione = this.classe + classi;
        if (promozione > 5 || promozione < 1) {
            return false;
        } else {
            this.classe = promozione;
            return true;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Il metodo clone() crea una copia dell'oggetto Studente.
        // È necessario dichiarare che la classe implementa Cloneable.
        Studente clonedStudente = (Studente) super.clone();
        // Clonare eventuali attributi specifici della classe Studente
        // (ad esempio, voti)
        // clonedStudente.setVoti(this.voti.clone());
        return clonedStudente;
    }

    @Override
    public boolean equals(Object obj) {
        // Il metodo equals() verifica l'uguaglianza tra due oggetti Studente.
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Studente studente = (Studente) obj;

        // Verifica l'uguaglianza degli attributi della classe e delle superclassi
        return super.equals(obj)
                && classe == studente.classe
                && isRipetente == studente.isRipetente
                && Arrays.equals(voti.toArray(), studente.voti.toArray());
    }

    @Override
    public int hashCode() {
        // Il metodo hashCode() restituisce un valore numerico univoco per l'oggetto.
        // La moltiplicazione per 31 può essere implementata più efficientemente dai compilatori rispetto ad altre costanti.
        // Il metodo restituisce il risultato finale, che rappresenta il codice hash univoco dell'oggetto Studente. 
        // Questo approccio garantisce che oggetti con attributi diversi generino diversi codici hash, riducendo il rischio di collisioni 
        // (ossia, situazioni in cui due oggetti diversi hanno lo stesso codice hash).
        int result = super.hashCode();
        result = 31 * result + classe;
        result = 31 * result + (isRipetente ? 1 : 0);
        result = 31 * result + Arrays.hashCode(voti.toArray());
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        // Il metodo finalize() viene chiamato dal Garbage Collector prima
        // di eliminare l'oggetto. Può essere utilizzato per operazioni di pulizia.
        // Esempio: Chiudere risorse aperte come connessioni al database.
        super.finalize();
    }

    @Override
    public String toString() {
        // Il metodo toString() restituisce una rappresentazione in formato stringa dell'oggetto.
        return "Studente{"
                + "scuola='" + scuola + '\''
                + ", classe=" + classe
                + ", isRipetente=" + isRipetente
                + ", voti=" + voti
                + "} " + super.toString();
    }
}
