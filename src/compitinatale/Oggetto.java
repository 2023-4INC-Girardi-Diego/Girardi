/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
public abstract class Oggetto {
    
    
    private Integer puntiDirettti;
    private Integer puntiIndiretti;
    private String nomeOgg;
    private String caratteristiche;

    public Oggetto(Integer puntiDirettti, Integer puntiIndiretti, String nomeOgg, String caratteristiche) {
        this.puntiDirettti = puntiDirettti;
        this.puntiIndiretti = puntiIndiretti;
        this.nomeOgg = nomeOgg;
        this.caratteristiche = caratteristiche;
    }

 
    

    @Override
    public String toString() {
        return nomeOgg +" "+ caratteristiche; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
