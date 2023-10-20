/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlli;

import java.util.Scanner;

/**
 *
 * @author diego.girardi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Inserisci il dividendo: ");
            int dividendo = in.nextInt();

            System.out.print("Inserisci il divisore: ");
            int divisore = in.nextInt();

            int divisione = dividendo / divisore;

            System.out.println(divisione);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println("La divisione per 0 o l'accesso a un indice di array fuori limiti non è possibile.");
        } catch (Exception e) {
            System.err.println("Qualcosa è andato storto.");
        }
    }
}

//se try fallisce allora fà catch, per un try ci possono
//essere più catch
//metto tutte le eccezioni specifiche prima 
//di quella generica, exception e sempre alla fine
// in un ctch posso metter epiù errori
// tipo (ArithmeticException | ArrayIndexOutOfBoundsException e)
// il try catch è utile perchè se viene trovato un errore puoi
//filtrarlo ed il codice prosegue
