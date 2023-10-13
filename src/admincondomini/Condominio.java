/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admincondomini;

/**
 *
 * @author diego.girardi
 */
public class Condominio {

    Appartamento[] appartamenti;
    String indirizzo;
    int totAppartamenti;
    String nome;

    public Condominio(Appartamento[] appartamenti, String indirizzo, String nome) {
        this.appartamenti = new Appartamento[appartamenti.length];

        for (int i = 0; i < this.appartamenti.length; i++) {
            this.appartamenti[i] = appartamenti[i];
        }

        this.indirizzo = indirizzo;
        this.nome = nome;
        this.totAppartamenti = this.appartamenti.length;
    }

    public int getTotAppartamenti() {
        return totAppartamenti;
    }

    public String getNome() {
        return nome;
    }

    public String proprietarioMaxMillesimi() {

        double millesimi = appartamenti[0].getMillesimi();
        String nome = appartamenti[0].getNomeProprietario();

        for (int i = 1; i < this.appartamenti.length; i++) {
            if (appartamenti[i].getMillesimi() > millesimi) {
                millesimi = appartamenti[i].getMillesimi();
                nome = appartamenti[i].getNomeProprietario();
            }
        }

        return "\n nel condominio " + this.nome + " il proprietario " + nome + " e' quello con piu millesimi (" + millesimi + ") in totale";
    }

}
