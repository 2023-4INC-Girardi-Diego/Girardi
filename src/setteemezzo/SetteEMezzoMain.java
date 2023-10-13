/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setteemezzo;

/**
 *
 * @author Utente
 */
public class SetteEMezzoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carta[][] carte = new Carta[4][10];

        for (int i = 0; i < carte.length; i++) {

            for (int c = 0; c < carte[i].length; c++) {
                carte[i][c] = new Carta();
                if (i == 0) {
                    carte[i][c].setSeme("danari");
                } else {
                    if (i == 1) {
                        carte[i][c].setSeme("coppe");
                    } else {
                        if (i == 2) {
                            carte[i][c].setSeme("spade");
                        } else {
                            carte[i][c].setSeme("bastoni");
                        }
                    }
                }

                int valoreCarta = c+1;
                carte[i][c].setValoreSuCarta(valoreCarta);
                if (valoreCarta <= 7) {
                    carte[i][c].setValoreInGioco(valoreCarta);
                } else {
                    carte[i][c].setValoreInGioco(0.5);
                }
            }

        }

        for (int i = 0; i < carte.length; i++) {
            for (int c = 0; c < carte[i].length; c++) {
                System.out.println(carte[i][c].stampa());
                System.out.println(i+" "+c);        
            }
        }

    }

}
