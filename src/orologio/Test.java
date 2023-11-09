/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orologio;

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
            
            OrologioDigitale l = new OrologioDigitale(13, 56, 25);
            l.suDodiciOre(true);
            System.out.println(l.stampa());
            
            OrologioCucu o = new OrologioCucu(10, 30, 25);
            System.out.println(o.stampa());
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
