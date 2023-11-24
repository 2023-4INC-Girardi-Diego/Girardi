/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orologio;

/**
 *
 * @author Utente
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            OrologioDigitale l = new OrologioDigitale(13, 56, 25);
            l.suDodiciOre(true);
            //System.out.println(l.stampa());

            OrologioCucu o = new OrologioCucu(12, 0, 0);
            //System.out.println(o.stampa());

            Orologio e = new Orologio(12, 13, 41);

            Orologio[] array = new Orologio[3];

            array[0] = l;
            array[1] = o;
            array[2] = e;

            String txt = "";

            for (int i = 0; i < array.length; i++) {

                txt += array[i].stampa() + "\n";

            }

            System.out.println(txt);

            txt = " ";

            array[0].aggiungiOra(12);
            array[1].aggiungiOra(4);
            array[2].aggiungiOra(3);

            for (int i = 0; i < array.length; i++) {

                txt += array[i].stampa() + "\n";

            }

            System.out.println(txt);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
