/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author Utente
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Persona a = new Persona("I", "I", "RSTMRC95M16H224T", "2006-01-23");
            Persona b = new Persona("I", "I", "RSSMRC95M16H224T", "a");

            System.out.println(Persona.getNumeroIstanze());
            
            System.out.println(a.calcolaEta());

        } catch (Exception e) {
             System.out.println("Si e verificata un'eccezione: " + e.getMessage());
        }

    }

}
