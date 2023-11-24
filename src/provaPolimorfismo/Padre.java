/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaPolimorfismo;

/**
 *
 * @author diego.girardi
 */
public class Padre {
    
    int pp;

    public Padre() {
        this.pp = 0;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPp() {
        return pp;
    }
    
    public void incrementa(){
        
        int num = this.pp;
        this.pp = num+1;
    }

   
    public String toString() {
       return "pp: "+pp; 
    }
    
    
    
}
