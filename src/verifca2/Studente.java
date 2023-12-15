/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verifca2;

import data.Data;

/**
 *
 * @author S51verifica06
 */
public class Studente extends Persona {

    private final String scuola = "I.T.T Buonarroti";
    private int classe;
    private boolean isRipetente;
    private float[] voti;

    public Studente(String cognome, String nome, Data dataDiNascita, int classe, boolean ripetente) throws Exception {
        super(cognome, nome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(ripetente);
    }

    public Studente() {
    }

    public void setClasse(int classe) throws Exception {
        if (classe <= 1 && classe >= 5) {
            throw new Exception("classe non esistente");
        } else {
            this.classe = classe;
        }
    }

    public void setIsRipetente(boolean isRipetente) {
        this.isRipetente = isRipetente;
    }

    public void setVoti(float[] voti) {
        this.voti = voti;
    }

    public int getClasse() {
        return classe;
    }

    public boolean verificaOmonimia(Studente studente) {

        boolean omonimia = false;

        if (super.verificaOmonimia(studente) == true && this.classe == studente.getClasse()) {
            omonimia = true;
        }

        return omonimia;
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if (classe <= 3.0f && classe >= 10.0f) {
            throw new Exception("voto non esistente");
        } else {
            float[] array = this.voti;

            array = new float[this.voti.length + 1];

            array[this.voti.length] = voto;

            this.voti = array;

        }
    }

    public void rimuoviVoto(int posizione) throws Exception {
        if (posizione > this.voti.length) {
            throw new Exception("posizione non esistente");
        } else {

            float[] array = this.voti;

            array[posizione] = 0.0f;

            float[] array2 = new float[this.voti.length];

            for (int i = 0; i < 10; i++) {
                if (array[i] == 0.0) {
                    i--;
                } else {
                    array2[i] = array[i];
                }

                this.voti = array2;

            }
        }

    }

    public boolean promuovi() throws Exception {

        boolean riuscita = true;

        int promozione = this.classe + 1;

        if (promozione > 5) {

            riuscita = false;

        } else {
            int promozione1 = this.classe + 1;

            this.classe = promozione1;

        }

        return riuscita;

    }

    public boolean promuovi(int classi) throws Exception {

        boolean riuscita = true;

        int promozione = this.classe + classi;

        if (promozione > 5) {

            riuscita = false;

        } else {
            int promozione1 = this.classe + classi;

            this.classe = promozione1;

        }

        return riuscita;

    }

    }
