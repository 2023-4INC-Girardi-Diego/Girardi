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

    public int trovaTudente(int numeroMatricola) {
        int indice = 0;
        while (indice < studente.length && studente[indice].getMatricola() != numeroMatricola) {
            indice++;
        }
        return indice;
    }

    private void shiftSx(int indice) {
        for (int i = indice; i < studente.length; i++) {
            studente[i] = studente[i + 1];
        }
    }

    public String remStudente(int numeroMAtricola) {
        String txt = "";
        int indice = trovaTudente(numeroMAtricola);

        if (indice > studente.length) {
            txt = "studente non esistente";
        } else {
            shiftSx(indice);
            txt = "studente eliminato";
        }

        return txt += "\n";
    }

    public String addStudente(Studente studente) {
        Studente[] array = new Studente[this.studente.length + 1];

        for (int i = 0; i < this.studente.length; i++) {
            array[i] = this.studente[i];
        }

        array[this.studente.length + 1] = studente;

        this.studente = array;

        return "studente aggiunto";
    }
    
    public int totStudenti(){
        
        return this.studente.length;
    }

}
