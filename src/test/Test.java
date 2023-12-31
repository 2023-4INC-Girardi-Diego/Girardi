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

    public static void main(String[] args) {
        Impiccato gioco = new Impiccato();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto a Impiccato!");
        gioco.stampaParolaCensurata();

        while (!gioco.getGiocoFinito()) {
            System.out.print("\nInserisci una lettera: ");
            char lettera = scanner.next().charAt(0);
            gioco.trovaLettera(lettera);
            gioco.stampaParolaCensurata();

            if (gioco.getGiocoFinito()) {
                if (gioco.getContatore() >= 5) {
                    System.out.println("La parola era: " + gioco.getParola());
                }
                break;
            }
        }

        scanner.close();
    }
}
