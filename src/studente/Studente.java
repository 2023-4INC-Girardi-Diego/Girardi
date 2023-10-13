/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studente;

/**
 *
 * @author girar
 */
public class Studente {

    private int matricola;
    private String cognomeNome;
    private int annoNascita;
    private String comuneResidenza;

    public Studente(int matricola, String cognomeNome, int annoNascita, String comuneResidenza) {
        this.annoNascita = annoNascita;
        this.cognomeNome = cognomeNome;
        this.comuneResidenza = comuneResidenza;
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getCognomeNome() {
        return cognomeNome;
    }
    
    
}
