/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author Utente
 */
public class OrologioCucu extends Orologio {

    public OrologioCucu(int ora, int minuti, int secondi) throws Exception {
        super(ora, minuti, secondi);
    }

    public String Cucu() {

        String txt = "";

        if (super.getOra() == 12 && super.getMinuti() == 0 && super.getSecondi() == 0) {
            txt = "CuCu!";
        }

        return txt;
    }

    @Override
    public String toString() {
        return super.toString() + Cucu();
    }


}
