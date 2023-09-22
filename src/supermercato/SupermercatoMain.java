/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercato;

/**
 *
 * @author Utente
 */
public class SupermercatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Prodotto[] prodotti = new Prodotto[4];

        prodotti[0] = new Prodotto(2.5, 10, 0.2, 0.05, "pane", "123456789012", "Prodotto A");
        prodotti[1] = new Prodotto(5.0, 22, 0.1, 0.1, "pasta", "987654321098", "Prodotto B");
        prodotti[2] = new Prodotto(3.75, 5, 0.3, 0.08, "sale", "567890123456", "Prodotto C");
        prodotti[3] = new Prodotto(2.25, 5, 0.7, 0.1, "latte", "5678901234556", "Prodotto D");


        for(int i = 0; i< prodotti.length; i++){
            System.out.println(prodotti[i].prezzoIvato());
        }
        

        Supermercato Lidl = new Supermercato("viale Dante", "lidl", prodotti);

        System.out.println(Lidl.merciSopraMedia());
        System.out.println(Lidl.prezzoAlto());
        System.out.println(Lidl.pesoMinore());
        System.out.println(Lidl.valoreMerce());
        
        Lidl.addProdotto(3.2, 22, 0.6, 0.1, "salsa", "1234567891235","Prodotto E" );
        
        System.out.println(Lidl.stampaArray());
        
        Lidl.remProd("Prodotto A");
        
        System.out.println(Lidl.stampaArray());
            
        }

    }


