/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author girar
 */
public class Prova {

    private int num;

    public Prova(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int minorDivisore() {
        int indice = 2;

        while (this.num % indice != 0) {

            indice++;
        }

        return indice;
    }

    public boolean range(int n1, int n2) {
        boolean risposta = false;
        if (num >= n1 && num <= n2) {
            risposta = true;
        }
        return risposta;
    }

}
