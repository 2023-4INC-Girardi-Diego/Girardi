/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentari;

/**
 *
 * @author diego.girardi
 */
public class Alimentare extends Prodotti {

    private Data scadenza;

    public Alimentare(double prezzo, String nome, String provenienza, String descrizione, Data scadenza) throws Exception {
        super(prezzo, nome, provenienza, descrizione);
        this.scadenza = scadenza;
    }

    public double modPrezzo() throws Exception {
        double nuovoPrezzo = 0.0;
        int giorniAllaScadenza = giorniAllaScadenza();

        if (giorniAllaScadenza < 10) {
            nuovoPrezzo = (super.getPrezzo() * 30) / 100;
        } else if (giorniAllaScadenza < 2) {
            nuovoPrezzo = (super.getPrezzo() * 50) / 100;
        } else if (giorniAllaScadenza <= 0) {
            throw new Exception("Prodotto scaduto");
        } else {
            nuovoPrezzo = super.getPrezzo(); // Nessuna modifica al prezzo
        }

        return nuovoPrezzo;
    }

    public int giorniAllaScadenza() {
        Data oggi = new Data(java.time.LocalDate.now().getDayOfMonth(), java.time.LocalDate.now().getMonthValue(), java.time.LocalDate.now().getYear());
        return oggi.differenzaGiorni(this.scadenza);
    }

    public String stampa() {
        return "no";
    }
}
