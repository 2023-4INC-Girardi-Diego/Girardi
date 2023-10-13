/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setteemezzo;

/**
 *
 * @author Utente
 */
public class Carta {

    private String seme = " ";
    private int valoreSuCarta = 0;
    private double valoreInGioco = 0.0;
    private boolean presente = true;

    public Carta(String seme, int valoreSuCarta, double valoreInGioco, boolean presente) {
        this.seme = seme;
        this.valoreSuCarta = valoreSuCarta;
        this.valoreInGioco = valoreInGioco;
        this.presente = presente;
    }

    public Carta() {
        this.seme = " ";
        this.valoreSuCarta = 0;
        this.valoreInGioco = 0.0;
        this.presente = true;
    }

    public String getSeme() {
        return seme;
    }

    public int getValoreSuCarta() {
        return valoreSuCarta;
    }

    public double getValoreInGioco() {
        return valoreInGioco;
    }

    public boolean getPresente() {
        return presente;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public void setValoreSuCarta(int valoreSuCarta) {
        this.valoreSuCarta = valoreSuCarta;
    }

    public void setValoreInGioco(double valoreInGioco) {
        this.valoreInGioco = valoreInGioco;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String stampa() {
        return this.seme +" "+ this.valoreSuCarta+ " " + this.valoreInGioco;

    }

}
