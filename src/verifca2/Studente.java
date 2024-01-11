/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifca2;

import data.Data;

/**
 *
 * @author S51verifica06
 */
public class Studente extends Persona {

    private final String scuola = "I.T.T Buonarroti";
    private int classe;
    private boolean isRipetente;
    private float[] voti;

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

    public void setVoti(float[] voti) {
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
        if (voto < 3.0f || voto > 10.0f) {
            throw new Exception("Voto non esistente");
        } else {
            float[] array = this.voti;

            array = new float[this.voti.length + 1];

            array[this.voti.length] = voto;

            this.voti = array;

        }
    }

    public void rimuoviVoto(int posizione) throws Exception {
        if (posizione < 0 || posizione >= this.voti.length) {
            throw new Exception("Posizione non esistente");
        } else {
            this.voti[posizione] = 0.0f;
        }
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
                && java.util.Arrays.equals(voti, studente.voti);
    }

    @Override
    public int hashCode() {
        // Il metodo hashCode() restituisce un valore numerico univoco per l'oggetto.
        // La moltiplicazione per 31 può essere implementata più efficientemente dai compilatori rispetto ad altre costanti.
        int result = super.hashCode();
        result = 31 * result + classe;
        result = 31 * result + (isRipetente ? 1 : 0);
        result = 31 * result + java.util.Arrays.hashCode(voti);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        // -Il metodo finalize() viene chiamato dal Garbage Collector prima
        // -di eliminare l'oggetto. Può essere utilizzato per operazioni di pulizia.
        // -Esempio: Chiudere risorse aperte come connessioni al database.
        // -il metodo restituisce il risultato finale, che rappresenta il codice hash univoco dell'oggetto Studente. 
        //  Questo approccio garantisce che oggetti con attributi diversi generino diversi codici hash, riducendo il rischio di collisioni 
        //  (ossia, situazioni in cui due oggetti diversi hanno lo stesso codice hash).
        super.finalize();
    }

    @Override
    public String toString() {
        // Il metodo toString() restituisce una rappresentazione in formato stringa dell'oggetto.
        return "Studente{"
                + "scuola='" + scuola + '\''
                + ", classe=" + classe
                + ", isRipetente=" + isRipetente
                + ", voti=" + java.util.Arrays.toString(voti)
                + "} " + super.toString();
    }
}
