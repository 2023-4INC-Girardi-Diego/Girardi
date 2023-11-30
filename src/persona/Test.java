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

            Persona a = new Persona("Si", "", "a", "a");
            Persona b = new Persona("Si", "", "a", "a");

            System.out.println(Persona.getNumeroIstanze());

        } catch (Exception e) {
             System.out.println("Si e verificata un'eccezione: " + e.getMessage());
        }

    }

}
