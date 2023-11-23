/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipolazionestringhe;

/**
 *
 *
 * @author Utente
 */
import java.util.Scanner;

public class Manipolazione {

    public String manipolazione() {

        String txt = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String testo = scanner.nextLine();

        // Metodo length(): restituisce la lunghezza della stringa
        int lunghezza = testo.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);
        
        Scanner scanner1 = new Scanner(System.in);
        int max = testo.length()-1;
        System.out.print("Inserisci una posizione da 0 a "+max+": ");
        int posizione = scanner1.nextInt();

        // Metodo charAt(): restituisce il carattere all'indice specificato
        char carattere = testo.charAt(posizione);
        System.out.println("Carattere alla posizione "+ posizione +": " + carattere);
  
        // Metodo substring(): restituisce una sottostringa a partire dall'indice specificato
        String sottostringa = testo.substring(9, 18);
        txt += ("\n Sottostringa dall'indice 9 all'indice 18: " + sottostringa);

        // Metodo toLowerCase() e toUpperCase(): converte la stringa in minuscolo o maiuscolo
        String minuscolo = testo.toLowerCase();
        String maiuscolo = testo.toUpperCase();
        txt += ("\n Stringa in minuscolo: " + minuscolo);
        txt += ("\n Stringa in maiuscolo: " + maiuscolo);

        // Metodo indexOf() e lastIndexOf(): restituisce l'indice della prima e dell'ultima occorrenza di un carattere o una stringa
        int indicePrimaOccorrenza = testo.indexOf('m');
        int indiceUltimaOccorrenza = testo.lastIndexOf('m');
        txt += ("\n Indice della prima occorrenza di 'm': " + indicePrimaOccorrenza);
        txt += ("\n Indice dell'ultima occorrenza di 'm': " + indiceUltimaOccorrenza);

        // Metodo replace(): sostituisce una sottostringa con un'altra
        String sostituita = testo.replace("manipolazione", "modifica");
        txt += ("\n Sostituzione della parola 'manipolazione': " + sostituita);

        // Metodo contains(): verifica se la stringa contiene una determinata sottostringa
        boolean contiene = testo.contains("esempio");
        txt += ("\n La stringa contiene la parola 'esempio': " + contiene);

        // Metodo compareTo() e equals(): confronto tra stringhe
        String altraStringa = "esempio di manipolazione delle stringhe";
        int confronto = testo.compareTo(altraStringa);
        boolean uguale = testo.equals(altraStringa);
        txt += ("\n Confronto tra stringhe: " + confronto);
        txt += ("\n Le stringhe sono uguali? " + uguale);

        // Metodo indexOf() e lastIndexOf() con posizioni aggiuntive
        int indiceDa = testo.indexOf('i', 10);
        int indiceA = testo.lastIndexOf('i', 20);
        txt += ("\n Indice della lettera 'i' a partire dalla posizione 10: " + indiceDa);
        txt += ("\n Ultimo indice della lettera 'i' entro la posizione 20: " + indiceA);

        // Metodo substring() con un solo indice
        String dopoPosizione = testo.substring(8);
        txt += ("\n Sottostringa dalla posizione 8 fino alla fine: " + dopoPosizione);

        // Metodo replaceAll() e replaceFirst()
        String sostituzioneTutte = testo.replaceAll("i", "X");
        String sostituzionePrima = testo.replaceFirst("i", "Y");
        txt += ("\n Sostituzione di tutte le 'i': " + sostituzioneTutte);
        txt += ("\n Sostituzione della prima 'i': " + sostituzionePrima);

        // Metodo toCharArray()
        char[] caratteri = testo.toCharArray();
        txt += ("\n La stringa in un array di caratteri: " + java.util.Arrays.toString(caratteri));

        // Metodo startsWith()  con offset
        boolean iniziaConOffset = testo.startsWith("di", 9);
        txt += ("\n La stringa inizia con 'di' a partire dalla posizione 9: " + iniziaConOffset);

        // Metodo matches()
        boolean corrisponde = testo.matches(".*manipolazione.*");
        txt += ("\n La stringa corrisponde all'espressione regolare '.*manipolazione.*': " + corrisponde);

        // Metodo trim(): rimuove gli spazi bianchi iniziali e finali
        String senzaSpazi = testo.trim();
        txt += ("\n Stringa senza spazi bianchi: \"" + senzaSpazi + "\"");

        // Metodo startsWith() e endsWith(): verifica se la stringa inizia o finisce con una determinata sottostringa
        boolean iniziaCon = testo.startsWith("Esempio");
        boolean finisceCon = testo.endsWith("stringhe");
        txt += ("\n La stringa inizia con 'Esempio': " + iniziaCon);
        txt += ("\n La stringa finisce con 'stringhe': " + finisceCon);

        // Metodo isEmpty(): verifica se la stringa è vuota
        boolean vuota = testo.isEmpty();
        txt += ("\n La stringa è vuota? " + vuota);

        // Metodo split(): divide la stringa in sottostringhe basate su uno spazio
        String[] parole = testo.split(" ");
        txt += ("\n Numero di parole nella stringa: " + parole.length);

        // Metodo concat(): concatena una stringa con un'altra
        String nuovaStringa = testo.concat(" Aggiunta di una nuova parte.");
        txt += ("\n Nuova stringa concatenata: \"" + nuovaStringa + "\"");

        // Metodo charAt(): restituisce il codice Unicode del carattere all'indice specificato
        int unicode = testo.charAt(4);
        txt += ("\n Codice Unicode del carattere alla posizione 4: " + unicode);

        // Metodo valueOf(): converte altri tipi di dati in stringhe
        int numero = 42;
        String numeroStringa = String.valueOf(numero);
        txt += ("\n Numero convertito in stringa: " + numeroStringa);

        return txt;
    }
}
