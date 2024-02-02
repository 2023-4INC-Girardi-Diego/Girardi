/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
public class Cella {
    private int riga;
    private int colonna;

    public Cella(int riga, int colonna) {
        this.riga = riga;
        this.colonna = colonna;
    }

    @Override
    public String toString() {
        return this.riga+"-"+this.colonna;
    }
    
    
}
