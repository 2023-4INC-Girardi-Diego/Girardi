/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prodotto;

/**
 *
 * @author Utente
 */
public class Prodotto {

    private double prezzo;
    private double iva;
    private double peso;
    private double tara; //imballaggio
    private String descrizione;
    private String codiceABarre;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, String codiceABarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceABarre = codiceABarre;
    }

    public Prodotto() {

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

    public String getCodiceABarre() {
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

    public void setCodiceABarre(String codiceABarre) {
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

        for (int i = 0; i < 12; i++) {
            int cifra = Character.getNumericValue(codiceABarre.charAt(i));
            if (i % 2 == 0) {
                somma += cifra * 3;
            } else {
                somma += cifra;
            }
        }

        int resto = somma % 10;
        int cifraControllo = Character.getNumericValue(codiceABarre.charAt(12));

        if (resto == cifraControllo) {
            trueFalse = "codice approvato";
        } else {
            trueFalse = "codice errato";
        }

        return trueFalse + "\n" + resto;
    }
}
