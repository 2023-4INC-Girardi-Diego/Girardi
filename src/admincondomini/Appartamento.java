/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admincondomini;

/**
 *
 * @author diego.girardi
 */
public class Appartamento {

    int numero;
    String nomeProprietario;
    double millesimi;

    public Appartamento(int numero, String nomeProprietario, double millesimi) {
        this.numero = numero;
        this.nomeProprietario = nomeProprietario;
        this.millesimi = millesimi;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getMillesimi() {
        return millesimi;
    }

}
