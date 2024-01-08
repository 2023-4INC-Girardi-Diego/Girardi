/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
import java.util.Scanner;

public class Gioco {

    private Oggetto[][] tabella;
    private Giocatore[] giocatori;

    public Gioco() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserire numero di righe : ");
        int righe = scanner.nextInt();
        System.out.print("inserire numero di colonne : ");
        int colonne = scanner.nextInt();
        this.tabella = new Oggetto[righe][colonne];
        System.out.print("Inserisci il numero di giocatori (max 8) : ");
        int numero = scanner.nextInt();
        setGiocatori(numero);

    }

    public void setGiocatori(int numero) throws Exception {
        if (numero > 8) {
            throw new Exception("numero massimo giocatori superato, massimo 8 giocatori");
        } else {
            this.giocatori = new Giocatore[numero - 1];
        }

    }

    public void inserimentoNome(int giocatore, String nome) throws Exception {
        this.giocatori[giocatore].setNome(nome);
    }

    public boolean controlloFine() {
        boolean fine = false;

        for (int i = 0; i < this.tabella.length; i++) {
            for (int j = 0; j < this.tabella[i].length; j++) {
                if (this.tabella[i][j] == null) {
                    fine = true;
                } else {
                    fine = false;
                }
            }
        }

        return fine;
    }

}
