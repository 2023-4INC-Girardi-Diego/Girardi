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

        public Numero(int numero) {
            this.num = numero;
        }

        public int getNum() {
            return num;
        }

        public int minorDivisore() {
            double resto = 0.5;

            int indice = 2;

            while (resto == 0.0) {

                resto = this.num % indice;

                if (resto == 0.0) {

                } else {
                    indice++;
                }

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


