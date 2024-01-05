/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
public class Gomme extends Oggetto {

    public Gomme(String caratteristiche) throws Exception{

        super(caratteristiche.equals("rossa") ? -1 : 2, null, "Gomma", caratteristiche);

        controlloCarattteristiche(caratteristiche);
    }
    
    private void controlloCarattteristiche(String caratteristiche) throws Exception{
       if (!(caratteristiche.equals("rossa") || caratteristiche.equals("morbida") || caratteristiche.equals("dura"))) {
            throw new Exception("la caratteristica non è tra quelle presenti ovvero rossa, morbida e dura");
        }   
    }
    

}
