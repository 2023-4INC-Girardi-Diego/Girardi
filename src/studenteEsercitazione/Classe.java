/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenteEsercitazione;

/**
 *
 * @author diego.girardi
 */
public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        setCapoClasse(capoClasse);
        setStudenti(studenti);
    }

    public void setCapoClasse(Studente capoClasse) throws Exception {
        if (capoClasse == null || capoClasse.nome == null || capoClasse.cognome == null) {
            throw new Exception("Il capo classe non puo essere nullo, vuoto o mancare di nome/cognome.");
        }
        this.capoClasse = capoClasse;
    }

    public void setStudenti(Studente[] studenti) throws Exception {
        if (studenti == null) {
            throw new Exception("Gli studenti non possono essere nulli.");
        }
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] == null || studenti[i].nome == null || studenti[i].cognome == null) {
                throw new Exception("Uno studente ha qualche problema.");
            }
            this.studenti[i] = studenti[i];
        }
    }

    public String toString() {

        String txt = "";

        for (int i = 0; i < this.studenti.length; i++) {
            txt += "\n" + studenti[i].getNome();
        }

        return txt;
    }
}
