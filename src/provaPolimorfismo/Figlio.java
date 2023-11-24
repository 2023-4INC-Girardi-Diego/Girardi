/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaPolimorfismo;

/**
 *
 * @author diego.girardi
 */

public class Figlio extends Padre{
    
    String ff;

    public Figlio() {
        this.ff = "figlio" ;
    }
    
    public void incrementa(){
        this.ff = "ho modificato il metodo padre";
    }

    @Override
    public String toString() {
        return super.toString()+" ff: "+ff; 
    }
    
    
    
    
}
