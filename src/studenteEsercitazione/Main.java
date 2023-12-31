/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studenteEsercitazione;

/**
 *
 * @author diego.girardi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Studente capo = new Studente("Diego", "Girardi");
            Studente[] studenti = new Studente[4];

            studenti[0] = new Studente("Mario", "Rossi");
            studenti[1] = new Studente("Luigi", "Verdi");
            studenti[2] = new Studente("Aldo", "Rossi");
            studenti[3] = new Studente("Zanzibar", "Verdi");

            Classe inc = new Classe(capo, studenti);

            System.out.println(capo.toString());
            System.out.println(inc.toString());
            
            inc.ordinaStudenti();
            
            System.out.println(inc.toString());
            
            inc.invertiAttributi();
            
            System.out.println(inc.toString());
            System.out.println(capo.toString());
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
