/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifica;

/**
 *
 * @author Utente
 */
public class Tavolo {

    private int capienza;
    private int numPers;
    private int numTav;
    private boolean prenotato;

    public Tavolo(int capienza, int numPers, int numTav, boolean prenotato) {
        this.capienza = capienza;
        this.numPers = numPers;
        this.numTav = numTav;
        this.prenotato = prenotato;
    }

    public Tavolo(Tavolo t) {
        this.capienza = t.capienza;
        this.numPers = t.numPers;
        this.numTav = t.numTav;
        this.prenotato = t.prenotato;
    }

    public boolean siediti() {
        boolean ris = false;
        if (numPers < capienza) {
            numPers++;
            ris = true;
        }
        return ris;
    }

    public boolean alzati(int nPersone) {
        int persone = numPers;
        boolean ris = false;
        if (numPers > 0) {
            this.numPers = persone - nPersone;
            ris = true;
        }
        return ris;
    }

    public boolean prenota(int numPers) {
        boolean ris = false;
        if (!prenotato && numPers <= capienza) {
            prenotato = true;
            ris = true;
        }
        return ris;
    }

    public boolean disdici() {
        if (prenotato == true) {
            prenotato = false;
        }
        return prenotato;
    }

    public int getNumPers() {
        return numPers;
    }

    public int getCapienza() {
        return capienza;
    }

    public int getNumTav() {
        return numTav;
    }

    public boolean isPrenotato() {
        return prenotato;
    }

}
