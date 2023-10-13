/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admincondomini;

/**
 *
 * @author diego.girardi
 */
public class Amministratore {

    Condominio[] condomini;

    public Amministratore(Condominio[] condomini) {
        this.condomini = new Condominio[condomini.length];

        for (int i = 0; i < this.condomini.length; i++) {
            this.condomini[i] = condomini[i];
        }
    }

    public String proprietarioMaxMillesimi() {

        String txt = "";

        for (int i = 0; i < this.condomini.length; i++) {

            txt += condomini[i].proprietarioMaxMillesimi();

        }

        return txt;
    }

    public String condominioMaggiore() {

        String nome = condomini[0].getNome();;

        int maggiore = condomini[0].getTotAppartamenti();

        for (int i = 1; i < this.condomini.length; i++) {
            if (this.condomini[i].getTotAppartamenti() > maggiore) {
                nome = this.condomini[i].getNome();
                maggiore = this.condomini[i].getTotAppartamenti();

            }
        }

        return "\n il condominio " + nome + " e quello con piu appartameti, " + maggiore + " in totale";
    }
}
