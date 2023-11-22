/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipolazionestringhe;

/**
 *
 * @author Utente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String testo = "Esempio di manipolazione delle stringhe";

        // Metodo length(): restituisce la lunghezza della stringa
        int lunghezza = testo.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);

        // Metodo charAt(): restituisce il carattere all'indice specificato
        char carattere = testo.charAt(3);
        System.out.println("Carattere alla posizione 3: " + carattere);

        // Metodo substring(): restituisce una sottostringa a partire dall'indice specificato
        String sottostringa = testo.substring(9, 18);
        System.out.println("Sottostringa dall'indice 9 all'indice 18: " + sottostringa);

        // Metodo toLowerCase() e toUpperCase(): converte la stringa in minuscolo o maiuscolo
        String minuscolo = testo.toLowerCase();
        String maiuscolo = testo.toUpperCase();
        System.out.println("Stringa in minuscolo: " + minuscolo);
        System.out.println("Stringa in maiuscolo: " + maiuscolo);

        // Metodo indexOf() e lastIndexOf(): restituisce l'indice della prima e dell'ultima occorrenza di un carattere o una stringa
        int indicePrimaOccorrenza = testo.indexOf('m');
        int indiceUltimaOccorrenza = testo.lastIndexOf('m');
        System.out.println("Indice della prima occorrenza di 'm': " + indicePrimaOccorrenza);
        System.out.println("Indice dell'ultima occorrenza di 'm': " + indiceUltimaOccorrenza);

        // Metodo replace(): sostituisce una sottostringa con un'altra
        String sostituita = testo.replace("manipolazione", "modifica");
        System.out.println("Sostituzione della parola 'manipolazione': " + sostituita);

        // Metodo contains(): verifica se la stringa contiene una determinata sottostringa
        boolean contiene = testo.contains("esempio");
        System.out.println("La stringa contiene la parola 'esempio': " + contiene);
    }

}
