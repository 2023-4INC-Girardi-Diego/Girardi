/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prodotto;

import java.util.Arrays;

/**
 *
 * @author Utente
 */
public class Prodotto1 {

    private double prezzo = 0;
    private double iva = 0;
    private double peso = 0;
    private double tara = 0; //imballaggio
    private String descrizione = "";
    private int[] codiceABarre;

    public Prodotto1(double prezzo, double iva, double peso, double tara, String descrizione, int[] codiceABarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceABarre = codiceABarre;
    }

    public Prodotto1() {

    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public double getPeso() {
        return peso;
    }

    public double getTara() {
        return tara;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int[] getCodiceABarre() {
        return codiceABarre;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setCodiceABarre(int[] codiceABarre) {
        this.codiceABarre = codiceABarre;
    }

    public double prezzoIvato() {
        return prezzo + prezzo * (iva / 100);
    }

    public double pesoLordo() {
        return peso + tara;
    }

    public String controlloCodice() {

        String trueFalse = "";
        int somma = 0;

        for (int i = 0; i < codiceABarre.length - 1; i++) {
            int cifra = codiceABarre[i];
            if (i % 2 == 0) {
                somma += cifra * 3;
            } else {
                somma += cifra;
            }
        }

        int resto = somma % 10;
        int cifraControllo = codiceABarre[12];

        if (resto == cifraControllo) {
            trueFalse = "codice approvato";
        } else {
            trueFalse = "codice errato";
        }

        return trueFalse + "\n" + resto;
    }
}
