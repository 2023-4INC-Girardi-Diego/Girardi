/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admincondomini;

/**
 *
 * @author diego.girardi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Appartamento[] appartamenti = new Appartamento[3];
        
        appartamenti[0] = new Appartamento(1, "Giulio", 300);
        appartamenti[1] = new Appartamento(2, "Pietro", 400);
        appartamenti[2] = new Appartamento(3, "Marco", 100);
        
        Appartamento[] appartamenti1 = new Appartamento[2];
        
        appartamenti1[0] = new Appartamento(1, "Umbero", 600);
        appartamenti1[1] = new Appartamento(2, "Marcolino", 50);
        
        Condominio[] condominio1 = new Condominio[2];
        
        condominio1[0] = new Condominio(appartamenti1,"sium", "AfterLife");
        condominio1[1] = new Condominio(appartamenti,"sium", "Tryhard");
        
        Amministratore admin = new Amministratore(condominio1);
        
        System.out.println(admin.condominioMaggiore());
         System.out.println(admin.proprietarioMaxMillesimi());
        
    }

}
