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

    public Classe(Studente capoClasse, Studente[] studenti) {
        try {
            setCapoClasse(capoClasse);
            setStudenti(studenti);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public final void setCapoClasse(Studente capoClasse) throws Exception {
        try {
            capoClasse.setNome(capoClasse.nome);
            capoClasse.setCognome(capoClasse.cognome);
            this.capoClasse = capoClasse;
        } catch (Exception e) {
            throw new Exception("Il capo classe non puo essere nullo, vuoto o mancare di nome/cognome.");
        }
    }

    public final void setStudenti(Studente[] studenti) throws Exception {

        this.studenti = new Studente[studenti.length];
        
        try {

            for (int i = 0; i < studenti.length; i++) {
                studenti[i].setNome(studenti[i].nome);
                studenti[i].setCognome(studenti[i].cognome);
               
                this.studenti[i] = studenti[i];

            }
        } catch (Exception e) {
            throw new Exception("uno studente ha qualche problema");
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
