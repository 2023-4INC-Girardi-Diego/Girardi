/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prodotto;

/**
 *
 * @author Utente
 */
public class ProdottoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {9, 7, 8, 8, 8, 9, 1, 9, 0, 4, 5, 7, 7};
        //Prodotto1 prodotto = new Prodotto1(20.0, 22.0, 4.5, 0.1, "pane", array);
        Prodotto prodotto = new Prodotto(20.0, 22.0, 4.5, 0.1, "pane","1234567891235" );

        System.out.println("Prezzo Ivato: " + prodotto.prezzoIvato());
        System.out.println("Peso Lordo: " + prodotto.pesoLordo());
        System.out.println("Controllo Codice: " + prodotto.controlloCodice());
    }

}
