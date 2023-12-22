/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girardi;

/**
 *
 * @author Utente
 */
public class Studente extends Persona {

    private final String scuola = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente(String cognome, String nome, Data dataDiNascita, int classe, boolean ripetente) throws Exception {
        super(cognome, nome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(ripetente);
        voti = new Float[0];
    }

    public Studente() {
    }

    public void setClasse(int classe) throws Exception {
        if (classe <= 1 && classe >= 5) {
            throw new Exception("classe non esistente");
        } else {
            this.classe = classe;
        }
    }

    public void setIsRipetente(boolean isRipetente) {
        this.isRipetente = isRipetente;
    }

    public void setVoti(Float[] voti) {
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
        if (voto == null) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10 e non può essere null");
        }
        if (voto < 0 || voto > 10) {
            throw new Exception("Il voto deve essere compreso tra 0 e 10");
        }
        if (voti == null) {
            throw new Exception("L'array non può essere null");
        } else {
            Float[] temp = new Float[voti.length + 1];
            for (int i = 0; i < voti.length; i++) {
                temp[i] = voti[i];
            }
            temp[voti.length] = voto;
            voti = temp;
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione >= voti.length || posizione < 0) {
            throw new Exception("La posizione supera i limiti dell'array");
        }
        Float[] nuovo = new Float[voti.length - 1];
        for (int i = 0; i < nuovo.length; i++) {
            if (i < posizione) {
                nuovo[i] = voti[i];
            } else if (i >= posizione) {
                nuovo[i] = voti[i + 1];
            }
        }
        voti = nuovo;
    }

    public boolean promuovi() throws Exception {

        boolean riuscita = true;

        int promozione = this.classe + 1;

        if (promozione > 5) {

            riuscita = false;

        } else {
            int promozione1 = this.classe + 1;

            this.classe = promozione1;

        }

        return riuscita;

    }

    public boolean promuovi(int classi) throws Exception {

        boolean riuscita = true;

        int promozione = this.classe + classi;

        if (promozione > 5) {

            riuscita = false;

        } else {
            int promozione1 = this.classe + classi;

            this.classe = promozione1;

        }

        return riuscita;

    }

    @Override
    public String info() throws Exception {
        if (classe == null || isRipetente == null || voti == null) {
            throw new Exception("Gli attributi non possono essere null");
        } else {
            String t = "";
            t += "Scuola: " + scuola + "\n";
            t += "Classe: " + classe + "\n";
            t += super.info() + "\n";
            t += "Ripetente: " + Ripetente() + "\n";
            t += "Voti: " + stampaVoti() + "\n";
            return t;
        }
    }

    private String stampaVoti() {
        String t = "";
        if (voti.length == 0) {
            t = "non ci sono voti";
        } else {
            t = "[" + voti[0];
            for (int i = 1; i < voti.length; i++) {
                t += "," + voti[i];
            }
            t += "]";
        }
        return t;
    }

    private String Ripetente() {

        String txt = " ";

        if (this.isRipetente == true) {
            txt += "SI";
        } else {
            txt += "NO";
        }

        return txt;

    }

}
