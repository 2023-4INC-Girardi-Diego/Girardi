/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentari;

/**
 *
 * @author diego.girardi
 */
public class Prodotti {

    private double prezzo;
    private String nome;
    private String provenienza;
    private String descrizione;

    public Prodotti(double prezzo, String nome, String provenienza, String descrizione) throws Exception {
        setPrezzo(prezzo);
        setNome(nome);
        setProvenienza(provenienza);
        setDescrizione(descrizione);
    }

    public void setDescrizione(String descrizione) throws Exception {
        if (descrizione != null && !descrizione.isEmpty()) {
            this.descrizione = descrizione;
        } else {
            throw new Exception("prodotto senza descrizione");
        }
    }

    public void setNome(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("prodotto senza nome");
        }
    }

    public void setPrezzo(double prezzo) throws Exception {
        if (prezzo != 0.0) {
            this.prezzo = prezzo;
        } else {
            throw new Exception("prodotto senza prezzo");
        }
    }

    public void setProvenienza(String provenienza) throws Exception {
        if (provenienza != null && !provenienza.isEmpty()) {
            this.provenienza = provenienza;
        } else {
            throw new Exception("prodotto senza provenienza");
        }
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getProvenienza() {
        return provenienza;
    }
    
    

}
