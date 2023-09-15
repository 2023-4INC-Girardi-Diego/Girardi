/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

/**
 *
 * @author Utente
 */
public class Supermercato {

    private String indirizzo = "";
    private String nome = "";
    private Prodotto[] prodotti;

    public Supermercato(String indirizzo, String nome, Prodotto[] prodotti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prodotti = prodotti;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public String prezzoAlto() {
        double prezzoAlto = prodotti[0].getPrezzoIvato();
        String nomeProdottoPrezzoAlto = prodotti[0].getNome();

        for (int i = 1; i < prodotti.length; i++) {
            double prezzoIvatoCorrente = prodotti[i].getPrezzoIvato();

            if (prezzoIvatoCorrente > prezzoAlto) {
                prezzoAlto = prezzoIvatoCorrente;
                nomeProdottoPrezzoAlto = prodotti[i].getNome();
            }
        }

        return "Il prodotto con il prezzo ivato piu alto e: " + nomeProdottoPrezzoAlto + " con prezzo: " + prezzoAlto;
    }

    public String valoreMerce() {
        double valoreTotale = 0;

        for (int i = 0; i < prodotti.length; i++) {
            valoreTotale += prodotti[i].getPrezzo();
        }

        return "il valore totale della merce ammonta a: " + valoreTotale;
    }

    public String pesoMinore() {

        double pesoMinore = prodotti[0].getPeso();
        String nomeProdottoPesoMinore = prodotti[0].getNome();

        for (int i = 1; i < prodotti.length; i++) {
            double pesoCorrente = prodotti[i].getPeso();

            if (pesoCorrente < pesoMinore) {
                pesoMinore = pesoCorrente;
                nomeProdottoPesoMinore = prodotti[i].getNome();
            }
        }

        return "Il prodotto con il peso minore e: " + nomeProdottoPesoMinore + " con peso: " + pesoMinore;

    }

    public String merciSopraMedia() {
        double sommaTutteMerci = 0;

        for (int i = 0; i < prodotti.length; i++) {
            sommaTutteMerci += prodotti[i].getPrezzo();
        }

        double prezzoMediato = sommaTutteMerci / prodotti.length;


        String calcoloSopraMedia = "";

        for (int i = 0; i < prodotti.length; i++) {

            if (prodotti[i].getPrezzo() > prezzoMediato) {
                calcoloSopraMedia += prodotti[i].getNome() + "\n";
            }
        }

        return "I prodotti con prezzo sopra la media sono: " + calcoloSopraMedia;
    }

}
