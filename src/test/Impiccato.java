/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Utente
 */
public class Impiccato {

    private String parola = "precipitevolissimevolmente";
    private StringBuilder censura;
    private int contatore;
    private boolean giocoFinito;

    public Impiccato() {
        censura = new StringBuilder();
        for (int i = 0; i < parola.length(); i++) {
            censura.append("-");
        }
        contatore = 0;
        giocoFinito = false;
    }

    public void stampaParolaCensurata() {
        System.out.println("Parola: " + censura.toString());
    }

    public void trovaLettera(char lettera) {
    if (!giocoFinito) {
        boolean trovata = false;

        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == lettera) {
                trovata = true;
                censura.setCharAt(i, lettera);
            }
        }

        if (!trovata) {
            System.out.println("\nLettera non presente.");
            contatore++;

            if (contatore <= 5) {
                switch (contatore) {
                    case 1:
                        System.out.println("______\n|    |\n|    O\n|    \n|    \n|______\n");
                        break;
                    case 2:
                        System.out.println("______\n|    |\n|    O\n|    |\n|    \n|______\n");
                        break;
                    case 3:
                        System.out.println("______\n|    |\n|    O\n|   /|\n|    \n|______\n");
                        break;
                    case 4:
                        System.out.println("______\n|    |\n|    O\n|   /|\\\n|    \n|______\n");
                        break;
                    case 5:
                        System.out.println("______\n|    |\n|    O\n|   /|\\\n|   / \\\n|______\n");
                        System.out.println("Hai esaurito tutti i tentativi!");
                        giocoFinito = true;
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("\nLettera trovata!");
        }

        if (!censura.toString().contains("-")) {
            System.out.println("Complimenti, hai indovinato la parola!");
            giocoFinito = true;
        }
    }
}


    public boolean getGiocoFinito() {
        return this.giocoFinito;
    }

    public int getContatore() {
        return contatore;
    }

    public String getParola() {
        return parola;
    }
    
    
    
    

}
