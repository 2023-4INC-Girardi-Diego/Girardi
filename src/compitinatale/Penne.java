/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
public class Penne extends Oggetto{

    public Penne(String caratteristiche) {
        super(caratteristiche.equals("stilografica") ? 5 : 4, null, "Penna", null);
    }
    
    private void controlloCarattteristiche(String caratteristiche) throws Exception{
       if (!(caratteristiche.equals("stilografica") || caratteristiche.equals("sferografica") || caratteristiche.equals("biro"))) {
            throw new Exception("la caratteristica non è tra quelle presenti ovvero stilografica, sferografica e biro");
        }   
    }
    
}
