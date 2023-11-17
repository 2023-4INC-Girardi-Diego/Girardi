/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentari;

/**
 *
 * @author diego.girardi
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {

    private int giorno;
    private int mese;
    private int anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int differenzaGiorni(Data dataScadenza) {
        LocalDate oggi = LocalDate.now();
        LocalDate scadenza = LocalDate.of(dataScadenza.anno, dataScadenza.mese, dataScadenza.giorno);

        long differenza = ChronoUnit.DAYS.between(oggi, scadenza);
        return (int) differenza;

    }
}
