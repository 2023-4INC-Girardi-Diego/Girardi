/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setteemezzo;

import java.util.Random;

/**
 *
 * @author Utente
 */
public class SetteEMezzo {

    private static Carta[][] mazzo;
    private static double punteggioBanco = 0;
    private static int vittorieBanco = 0;
    private Carta[] manoBanco;

    public static int getVittorieBanco() {
        return vittorieBanco;
    }

    public Carta[] getManoBanco() {
        return manoBanco;
    }

    public static double getPunteggioBanco() {
        return punteggioBanco;
    }

    public static Carta[][] getMazzo() {
        return mazzo;
    }

    public static void setMazzo(Carta[][] mazzo) {
        SetteEMezzo.mazzo = mazzo;
    }

    public void setManoBanco(Carta[] manoBanco) {
        this.manoBanco = manoBanco;
    }

    public static void setPunteggioBanco(double punteggioBanco) {
        SetteEMezzo.punteggioBanco = punteggioBanco;
    }

    public static void setVittorieBanco(int vittorieBanco) {
        SetteEMezzo.vittorieBanco = vittorieBanco;
    }

    public static Carta[] pescaGenerale(Carta[] mano) {
        Random randomSeme = new Random();
        Random randomCarta = new Random();

        int seme = randomSeme.nextInt(4);
        int carta = randomCarta.nextInt(10);

        int contWhile = 0;

        Carta[] nuovaMano = new Carta[mano.length + 1];

        do {

            Carta[][] controlloPresenza = SetteEMezzo.getMazzo();

            if (controlloPresenza[seme][carta].getPresente()) {

                for (int i = 0; i < mano.length; i++) {
                    nuovaMano[i] = mano[i];
                }

                nuovaMano[nuovaMano.length - 1] = mazzo[seme][carta];

                Carta[][] aggiornaMazzo = SetteEMezzo.getMazzo();

                aggiornaMazzo[seme][carta].setPresente(false);

                SetteEMezzo.setMazzo(aggiornaMazzo);

                contWhile++;

            } else {

                seme = randomSeme.nextInt(4);
                carta = randomCarta.nextInt(10);

            }

        } while (contWhile == 0);

        return nuovaMano;

    }

    public void pescaBanco() {

        if (logicaPesca() == true) {
            this.manoBanco = pescaGenerale(manoBanco);

        }

        SetteEMezzo.punteggioBanco = 0;

        for (int i = 0; i < this.manoBanco.length; i++) {

            SetteEMezzo.punteggioBanco += this.manoBanco[i].getValoreInGioco();
        }

    }

    public boolean sceltaRandomico(double percentuale) {

        boolean scelta;

        Random random = new Random();

        double logica = random.nextDouble();

        if (logica <= percentuale) {
            scelta = true;
        } else {
            scelta = false;
        }

        return scelta;

    }

    public boolean logicaPesca() {

        boolean scelta = true;

        if (punteggioBanco < 2) {
            scelta = true;
        } else {
            if (punteggioBanco >= 7) {
                scelta = false;
            } else {
                if (punteggioBanco >= 2 && punteggioBanco < 3) {
                    scelta = sceltaRandomico(0.95);
                } else {
                    if (punteggioBanco >= 3 && punteggioBanco < 4) {
                        scelta = sceltaRandomico(0.75);
                    } else {
                        if (punteggioBanco >= 4 && punteggioBanco < 5) {
                            scelta = sceltaRandomico(0.55);
                        } else {
                            if (punteggioBanco >= 5 && punteggioBanco < 6) {
                                scelta = sceltaRandomico(0.25);
                            } else {
                                if (punteggioBanco >= 6 && punteggioBanco < 7) {
                                    scelta = sceltaRandomico(0.10);
                                }
                            }
                        }

                    }

                }

            }
        }

        return scelta;
    }

    public boolean perditaPuntiEccessivi() {

        boolean perditaPuntiEccessivi = false;

        if (this.punteggioBanco > 7.5 || Giocatore.getPunteggio() > 7.5) {
            perditaPuntiEccessivi = true;
        }

        return perditaPuntiEccessivi;
    }

    public String vincita() {

        double punteggioBanco = this.punteggioBanco;
        double punteggioGiocatore = Giocatore.getPunteggio();

        int vincitore; //1 banco (true), 2 giocatore (false), 3 pareggio

        if (perditaPuntiEccessivi() == true) {

            if (punteggioBanco > 7.5 && punteggioGiocatore > 7.5) {
                vincitore = 3;
            } else {
                if (punteggioGiocatore > 7.5) {
                    vincitore = 1;
                } else {
                    vincitore = 2;
                }
            }

        }//fine if perdita punti eccessivi

        if (punteggioBanco == punteggioGiocatore) {
            vincitore = 3;
        } else {
            if (punteggioGiocatore > punteggioBanco) {
                vincitore = 2;
            } else {
                vincitore = 1;
            }
        }

        String chiVince = "";

        int vittorieGiocatore = Giocatore.getVittorieGiocatore();

        switch (vincitore) {
            case 1:
                chiVince = " ha vinto il banco \n";
                SetteEMezzo.vittorieBanco++;
                break;

            case 2:
                chiVince = " ha vinto il giocatore \n";
                Giocatore.setVittorieGiocatore(vittorieGiocatore++);
                break;

            case 3:
                chiVince = " pareggio \n";
                break;

        }

        return chiVince + stampaSituazione();

    }

    public String stampaSituazione() {

        String situazione = "";

        situazione += "le carte del banco sono: \n";

        for (int i = 0; i < this.manoBanco.length; i++) {

            situazione += "il valore in gioco e' " + manoBanco[i].getValoreInGioco() + " il seme e' " + this.manoBanco[i].getSeme() + " il valore e' " + this.manoBanco[i].getValoreSuCarta() + "\n";

        }

        situazione += " il punteggio totale del banco e': " + SetteEMezzo.punteggioBanco + "\n";

        situazione += " le carte del giocatore sono: \n";

        situazione += Giocatore.stampaMano();

        situazione += " il punteggio del giocatore e': " + Giocatore.getPunteggio() + "\n";

        return situazione;

    }

}
