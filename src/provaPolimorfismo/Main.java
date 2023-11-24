/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provaPolimorfismo;

/**
 *
 * @author diego.girardi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre p = new Padre();
        Figlio f = new Figlio();
        Padre pf = new Figlio();
        Padre pp = pf;

        pp.incrementa();

        System.out.println("\np= " + p.toString());
        System.out.println("\npp= " + pp.toString());

        f.incrementa();

        System.out.println("\nf= " + f.toString());

        pf.incrementa();

        System.out.println("\npf= " + pf.toString());

        //Figlio ff = (Figlio)pp;
        //System.out.println("\nff= "+ff.toString());
        Figlio ff = (Figlio) pf;

        System.out.println("\nff= " + ff.toString());

    }

}
