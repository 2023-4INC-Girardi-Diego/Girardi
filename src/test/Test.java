/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author Utente
 */

import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Impiccato gioco = new Impiccato();

        while (true) {
            gioco.stampaParolaCensurata();
            System.out.print("Inserisci una lettera: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Inserisci una sola lettera!");
                continue;
            }

            char lettera = input.charAt(0);
            gioco.trovaLettera(lettera);

            // Controllo se la parola è stata indovinata completamente
            if (!gioco.censura.toString().contains("-")) {
                System.out.println("Complimenti, hai indovinato la parola!");
                break;
            }
        }
        scanner.close();
    }
}
