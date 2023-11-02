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
        
        Studente capo = new Studente("Diego", "Girardi");
        Studente[] studenti = new Studente[2];
        
        studenti[0] = new Studente("ciao", "no");
        studenti[1] = new Studente("ciao", "no");
        
        
        Classe inc = new Classe(capo, studenti);
        
        System.out.println(capo.toString());
        System.out.println(inc.toString());
        
    }
    
}
