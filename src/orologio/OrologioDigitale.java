/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author Utente
 */
public class OrologioDigitale extends Orologio {

    private String amOrpm = "";

    public OrologioDigitale(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
    }

    public void suDodiciOre(boolean scelta) throws Exception {

        int oraData = super.getOra();

        if (scelta == true) {
            if (super.getOra() > 12) {

                super.setOra(oraData - 12);
                this.amOrpm += "pm";
            } else {

                this.amOrpm += "am";
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + amOrpm;
    }



}
