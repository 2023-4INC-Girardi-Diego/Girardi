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

    private String parola = "alllo";
    public StringBuilder censura;

    public Impiccato() {
        censura = new StringBuilder();
        for (int i = 0; i < parola.length(); i++) {
            censura.append("-");
        }
    }

    public void stampaParolaCensurata() {
        System.out.println("Parola: " + censura.toString());
    }

    public void trovaLettera(char lettera) {
        boolean trovata = false;

        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == lettera) {
                trovata = true;
                censura.setCharAt(i, lettera);
            }
        }

        if (trovata) {
            System.out.println("Lettera trovata!");
        } else {
            System.out.println("Lettera non presente.");
        }
    }
    
}

