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

    // tutte queste exceptions inutili, i controlli sono già presenti in studente
    public void setCapoClasse(Studente capoClasse) throws Exception {
        if (capoClasse == null || capoClasse.nome == null || capoClasse.cognome == null) {
            throw new Exception("Il capo classe non puo essere nullo, vuoto o mancare di nome/cognome.");
        }
        this.capoClasse = capoClasse;
    }

    public void invertiAttributiTest() throws Exception {

        String nome = this.capoClasse.getNome();
        String cognome = this.capoClasse.getCognome();

        this.capoClasse.setCognome(nome);
        this.capoClasse.setNome(cognome);

        for (int i = 0; i < studenti.length; i++) {
            String nomeStud = this.studenti[i].getNome();
            String cognomeStud = this.studenti[i].getCognome();

            this.studenti[i].setCognome(nomeStud);
            this.studenti[i].setNome(cognomeStud);
        }
    }

    public void invertiAttributi() throws Exception {
        swapAttributi(this.capoClasse);

        for (int i = 0; i < studenti.length; i++) {
            swapAttributi(this.studenti[i]);
        }
    }

    private void swapAttributi(Studente persona) throws Exception {
        String temp = persona.getNome();
        persona.setNome(persona.getCognome());
        persona.setCognome(temp);
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

    public void ordinaStudenti() {

        Studente[] ordina = new Studente[this.studenti.length];

        char[] lettere = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int c = 0;
        for (int i = 0; i < lettere.length; i++) {
            for (int j = 0; j < this.studenti.length; j++) {
                if (this.studenti[j].primaLettera() == lettere[i]) {
                    ordina[c] = this.studenti[j];
                    c++;
                }
            }
        }

        this.studenti = ordina;

    }

    public String toString() {

        String txt = "";

        for (int i = 0; i < this.studenti.length; i++) {
            txt += "\n" + studenti[i].getNome();
        }

        return txt;
    }
}
