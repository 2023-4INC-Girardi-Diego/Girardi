/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlli;

/**
 *
 * @author diego.girardi
 */
public class ControlliTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlli controlli = new Controlli();

        try {
            controlli.setId("A312"); // Prova a impostare un ID valido
            System.out.println("ID impostato con successo: " + controlli.id);

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
