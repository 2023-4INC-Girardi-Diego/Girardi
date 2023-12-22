/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package girardi;

/**
 *
 * @author Utente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Data nascita = new Data(23, 1, 2006);
            Data nascita1 = new Data(1, 11, 1990);

            Persona a = new Persona("Girardi", "Diego", nascita);
            Persona b = new Persona("Girardi", "Diego", nascita);
            Persona c = new Persona("Debortoli", "Andrea", nascita);

            System.out.println(a.calcolaEta());
            System.out.println(a.info());
            System.out.println(a.verificaOmonimia(c));
            System.out.println(a.verificaOmonimia(b));

            System.out.println(Persona.getNumeroIstanze());

            Persona d = new Persona();

            //System.out.println(d.info());
            Studente e = new Studente("Smusi", "Pietro", nascita1, 1, true);
            Studente f = new Studente("Smusi", "Davide", nascita1, 1, false);

            System.out.println(e.verificaOmonimia(f));

            e.aggiungiVoto(3f);

            e.aggiungiVoto(4f);

            System.out.println(e.info());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
