/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aziendaagraria;

/**
 *
 * @author girar
 */
public class AziendaAgraria {

    private int[] mele;
    private String[] giorni;

    public AziendaAgraria(int[] mele, String[] giorni) {

        this.mele = copiaI(mele);
        this.giorni = copiaS(giorni);
    }

    private int[] copiaI(int[] copiaV) {
        int[] temp = new int[copiaV.length];
        for (int i = 0; i < copiaV.length; i++) {

            temp[i] = copiaV[i];

        }
        return temp;
    }

    private String[] copiaS(String[] copiaL) {
        String[] temp = new String[copiaL.length];
        for (int i = 0; i < copiaL.length; i++) {

            temp[i] = copiaL[i];

        }
        return temp;
    }

    private int totaleRaccolto() {
        int tot = 0;

        for (int i = 0; i < mele.length; i++) {
            tot += mele[i];
        }

        return tot;
    }

    public double mediaRaccolta() {

        return totaleRaccolto() / 7;
    }

    public String giorniMaggQuantita(int quantita) {
        int[] gg = new int[mele.length];
        String s = "";
        for (int i = 0; i < mele.length; i++) {

            if (quantita <= mele[i]) {

                s += giorni[i];

            }
 
        }
        return s;
    }

    private int trovaSabato() {
        
        int posizione = 0;
        
        for(int i = 0; i<giorni.length; i++){
            if(giorni[i]=="sabato"){
                posizione=i;
            }
        }
        
        
        return posizione;
    }
    
    public int meleSabato(){
        
        int i = trovaSabato();
        
        return mele[i];    
    }

}
