/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setteemezzo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Utente
 */
public class Giocatore {

    private static double punteggio = 0;
    private static Carta[] mano;
    private static int vittorieGiocatore = 0;

    public Giocatore(double punteggio, Carta[] mano, int vittorieGiocatore) {
        this.punteggio = punteggio;
        this.mano = mano;
        this.vittorieGiocatore = vittorieGiocatore;
    }

    public Giocatore() {

    }

    public static double getPunteggio() {
        return punteggio;
    }

    public static Carta[] getMano() {
        return mano;
    }

    public static int getVittorieGiocatore() {
        return vittorieGiocatore;
    }

    public static void setPunteggio(double punteggio) {
        Giocatore.punteggio = punteggio;
    }

    public static void setMano(Carta[] mano) {
        Giocatore.mano = mano;
    }

    public static void setVittorieGiocatore(int vittorieGiocatore) {
        Giocatore.vittorieGiocatore = vittorieGiocatore;
    }

    public void sceltaPesca() {

        Scanner scanner = new Scanner(System.in);
        String risposta = scanner.nextLine();

        if (risposta == "si") {
            this.mano = SetteEMezzo.pescaGenerale(mano);
        }

        Giocatore.punteggio = 0;

        for (int i = 0; i < this.mano.length; i++) {

            Giocatore.punteggio += this.mano[i].getValoreInGioco();
        }

    }

    public static String stampaMano() {

        double valInGioco = 0.0;
        String leMieCarte = "";

        for (int i = 0; i < mano.length; i++) {

            leMieCarte += "il valore in gioco e' " + mano[i].getValoreInGioco() + " il seme e' " + mano[i].getSeme() + " il valore su carta e' "
                    + mano[i].getValoreSuCarta() + "\n";

        }

        return leMieCarte;
    }



}
