/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifica;

/**
 *
 * @author Utente
 */
public class Ristorante {

    private int totalePersone;
    private int totTav;
    private Tavolo[] tavoli;

    public Ristorante(Tavolo[] t) {
        this.tavoli = t;
        this.totTav = tavoli.length;
        this.totalePersone = 0;
    }

    private int cercaTavolo(int numTav) {
        int indice = 0;
        while (indice < totTav && tavoli[indice].getNumTav() != numTav) {
            indice++;
        }
        return indice;
    }

    public String siediti(int numTav) {
        String txt = "";
        boolean ris = tavoli[cercaTavolo(numTav)].siediti();

        if (ris == true) {
            txt = "ti sei seuto! \n";
        } else {
            txt = "tutti i posti sono occupati :( \n";
        }

        return txt;

    }

    public String alzati(int numTav, int persone) {
        String txt = "";
        boolean ris = tavoli[cercaTavolo(numTav)].alzati(persone);

        if (ris == true) {
            txt = "ti sei/vi siete alzato/i \n";
        } else {
            txt = "non ci sono cosi' tante persone sedute al tavolo :( \n";
        }

        return txt;
    }

    public int totPersoneSedute() {
        for (int i = 0; i < totTav; i++) {
            this.totalePersone += this.tavoli[i].getNumPers();
        }

        return this.totalePersone;
    }

    public String prenota(int persone) {
        String txt = "";
        int i = 0;
        boolean tavoloTrovato = false;
        while (i < totTav && tavoloTrovato != true) {
            if (tavoli[i].prenota(persone) == true) {
                tavoloTrovato = true;
                txt = "tavolo prenotato!";
            } else {
                txt = "tavolo non disponibile :(";
            }

            i++;
        }

        return txt;

    }

    public String disdici(int numTav) {
        String txt = "";
        boolean disdetto = tavoli[cercaTavolo(numTav)].disdici();
        if (disdetto == false) {
            txt = "la prenotazione e'  stata disdetta";
        } else {
            txt = "non e' stato possibile disdire (numero tavolo probabilmente sbagliato)";
        }
        return txt;
    }

    public boolean addTav(Tavolo t) {

    }

    private void shiftSx(int indice) {
        for (int i = indice; i < totTav; i++) {
            tavoli[i] = tavoli[i + 1];
        }
    }

    public void remTav(int numTav) {
        shiftSx(cercaTavolo(numTav));
    }
}
