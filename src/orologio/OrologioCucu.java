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

    public String stampa() {
        
        String cucu = " CuCu!";
        String txt = super.getOra()+" : "+super.getMinuti()+" : "+super.getSecondi();
        
        if (super.getOra() == 12) {
            txt += cucu;
        }
        
        return txt;
    }
}
