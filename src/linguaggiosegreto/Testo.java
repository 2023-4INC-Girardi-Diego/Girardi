/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguaggiosegreto;

/**
 *
 * @author Utente
 */
//aeiou eioua bcdfghlmnpqrstvz cdfghlmnpqrstvzb 0123456789 1234567890
public class Testo {

    private String testo = "";

    public Testo(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String decodificatore() {

        String vocali = "aeiou";
        String[] consonanti = {"b", "c", "d", "f", "g", "h", "l", "m", "n", "p", "q", "r", "s", "t", "v", "z"};
        String[] numeri = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String testoDecodificato = "";



        String ricerca= " ";
        int indiceChar = 0;

        //metodo con le librerie
        for (int c = 0; c < testo.length(); c++) {

            ricerca = String.valueOf(testo.charAt(c));

            if(vocali.contains(ricerca)){
                indiceChar =  vocali.indexOf(ricerca);
                testoDecodificato += String.valueOf(vocali.charAt(indiceChar - 1));
            }
        }

        //metodo senza librerie
        boolean trovato = false;

        for (int c = 0; c < testo.length(); c++) {

            trovato = false;
            ricerca = String.valueOf(testo.charAt(c));

            for(int d = 0; d<consonanti.length; d++){
                if(ricerca == consonanti[d]){
                    testoDecodificato += consonanti[d-1];
                    trovato = true;
                }
            }

            for(int d = 0; d<numeri.length; d++){
                if(ricerca == numeri[d]){
                    testoDecodificato += numeri[d-1];
                    trovato = true;
                }
            }

            if(!trovato){
                testoDecodificato = ricerca;
            }

        }


        return testoDecodificato;
    }

}
