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

        // Metodo compareTo() e equals(): confronto tra stringhe
        String altraStringa = "esempio di manipolazione delle stringhe";
        int confronto = testo.compareTo(altraStringa);
        boolean uguale = testo.equals(altraStringa);
        System.out.println("Confronto tra stringhe: " + confronto);
        System.out.println("Le stringhe sono uguali? " + uguale);

        // Metodo indexOf() e lastIndexOf() con posizioni aggiuntive
        int indiceDa = testo.indexOf('i', 10);
        int indiceA = testo.lastIndexOf('i', 20);
        System.out.println("Indice della lettera 'i' a partire dalla posizione 10: " + indiceDa);
        System.out.println("Ultimo indice della lettera 'i' entro la posizione 20: " + indiceA);

        // Metodo substring() con un solo indice
        String dopoPosizione = testo.substring(8);
        System.out.println("Sottostringa dalla posizione 8 fino alla fine: " + dopoPosizione);

        // Metodo replaceAll() e replaceFirst()
        String sostituzioneTutte = testo.replaceAll("i", "X");
        String sostituzionePrima = testo.replaceFirst("i", "Y");
        System.out.println("Sostituzione di tutte le 'i': " + sostituzioneTutte);
        System.out.println("Sostituzione della prima 'i': " + sostituzionePrima);

        // Metodo toCharArray()
        char[] caratteri = testo.toCharArray();
        System.out.println("La stringa in un array di caratteri: " + java.util.Arrays.toString(caratteri));

        // Metodo startsWith()  con offset
        boolean iniziaConOffset = testo.startsWith("di", 9);
        System.out.println("La stringa inizia con 'di' a partire dalla posizione 9: " + iniziaConOffset);

        // Metodo matches()
        boolean corrisponde = testo.matches(".*manipolazione.*");
        System.out.println("La stringa corrisponde all'espressione regolare '.*manipolazione.*': " + corrisponde);

        // Metodo trim(): rimuove gli spazi bianchi iniziali e finali
        String senzaSpazi = testo.trim();
        System.out.println("Stringa senza spazi bianchi: \"" + senzaSpazi + "\"");

        // Metodo startsWith() e endsWith(): verifica se la stringa inizia o finisce con una determinata sottostringa
        boolean iniziaCon = testo.startsWith("Esempio");
        boolean finisceCon = testo.endsWith("stringhe");
        System.out.println("La stringa inizia con 'Esempio': " + iniziaCon);
        System.out.println("La stringa finisce con 'stringhe': " + finisceCon);

        // Metodo isEmpty(): verifica se la stringa è vuota
        boolean vuota = testo.isEmpty();
        System.out.println("La stringa è vuota? " + vuota);

        // Metodo split(): divide la stringa in sottostringhe basate su uno spazio
        String[] parole = testo.split(" ");
        System.out.println("Numero di parole nella stringa: " + parole.length);

        // Metodo concat(): concatena una stringa con un'altra
        String nuovaStringa = testo.concat(" Aggiunta di una nuova parte.");
        System.out.println("Nuova stringa concatenata: \"" + nuovaStringa + "\"");

        // Metodo charAt(): restituisce il codice Unicode del carattere all'indice specificato
        int unicode = testo.charAt(4);
        System.out.println("Codice Unicode del carattere alla posizione 4: " + unicode);

        // Metodo valueOf(): converte altri tipi di dati in stringhe
        int numero = 42;
        String numeroStringa = String.valueOf(numero);
        System.out.println("Numero convertito in stringa: " + numeroStringa);
    }

}
