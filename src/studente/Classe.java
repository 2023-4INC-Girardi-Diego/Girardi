/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studente;

/**
 *
 * @author girar
 */
public class Classe {

    private Studente[] studente;

    public Classe(Studente[] studenteArray) {
        this.studente = studenteArray;
    }

    public int trovaStudente(int numeroMatricola) {
        int indice = 0;
        while (indice < studente.length && studente[indice].getMatricola() != numeroMatricola) {
            indice++;
        }

        if (indice >= studente.length) {
            return -1; // Restituisce -1 quando lo studente non è stato trovato
        }
        //System.out.println(indice);
        return indice;

    }

    private void shiftSx(int indice) {
        for (int i = indice; i < studente.length - 1; i++) {
            studente[i] = studente[i + 1];
        }
        studente[studente.length - 1] = null;
    }

    public String remStudente(int numeroMatricola) {
        String txt = "";
        int indice = trovaStudente(numeroMatricola);

        if (indice == -1) {
            txt = "Studente non esistente o non trovato";
        } else {
            shiftSx(indice);
            Studente[] nuovoArray = new Studente[studente.length - 1];
            int nuovoIndice = 0;
            for (int i = 0; i < studente.length; i++) {
                if (studente[i] != null) {
                    nuovoArray[nuovoIndice] = studente[i];
                    nuovoIndice++;
                }
            }
            studente = nuovoArray;
            txt = "Studente eliminato";
        }

        return txt + "\n";
    }

    public String addStudente(Studente studente) {
        Studente[] array = new Studente[this.studente.length + 1];

        for (int i = 0; i < this.studente.length; i++) {
            array[i] = this.studente[i];
        }

        array[this.studente.length] = studente;

        this.studente = array;

        return "studente aggiunto";
    }

    public int totStudenti() {
        return this.studente.length;
    }

    public String stampa() {
        String txt = "\n";

        for (int i = 0; i < this.studente.length; i++) {
            txt += this.studente[i].getMatricola() + "\n";
        }

        return txt;
    }
}
