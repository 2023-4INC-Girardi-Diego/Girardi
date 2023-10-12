/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studente;

/**
 *
 * @author girar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Studente[] studenteArray = new Studente[3];
        
        studenteArray[0] = new Studente(89, "Girardi Diego", 2006, "Pergine");
        studenteArray[1] = new Studente(2, "Girardi Diego", 2006, "Pergine");
        studenteArray[2] = new Studente(19, "Girardi Diego", 2006, "Pergine");
   
        
        Classe classe = new Classe(studenteArray);
        
        //classe.trovaStudente(89);
        System.out.println(classe.stampa());
        
        System.out.println(classe.remStudente(2));
        
        System.out.println(classe.stampa());
        
        Studente studente = new Studente(5, "debortoli Andrea", 2006, "levico");
        
        System.out.println(classe.addStudente(studente));
        
        System.out.println(classe.stampa());
        
        System.out.println(classe.totStudenti());
        
        
    }
    
}
