/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Utente
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private static int numeroIstanze = 0;
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception {
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
        this.dataDiNascita = dataDiNascita;
        addIstanza();
    }

    private void addIstanza() {
        numeroIstanze++;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Il nome non può essere vuoto.");
        } else if (Character.isUpperCase(nome.charAt(0))) {
            this.nome = nome;
        } else {
            throw new Exception("Il nome deve iniziare con una lettera maiuscola.");
        }
    }

    public void setCognome(String cognome) throws Exception {
        if (cognome.isEmpty()) {
            throw new Exception("Il cognome non può essere vuoto.");
        } else if (Character.isUpperCase(cognome.charAt(0))) {
            this.cognome = cognome;
        } else {
            throw new Exception("Il cognome deve iniziare con una lettera maiuscola.");
        }
    }

    public void setCodFisc(String codFisc) throws Exception {
        if (codFisc.length() != 16) {
            throw new Exception("Codice fiscale troppo corto");
        }

        codFisc = codFisc.toUpperCase();

        for (int i = 0; i < 6; i++) {
            if (!Character.isLetter(codFisc.charAt(i))) {
                throw new Exception("Numeri all'inizio");
            }
        }

        for (int i = 6; i < 8; i++) {
            if (!Character.isDigit(codFisc.charAt(i))) {
                throw new Exception("Lettere in centro");
            }
        }

        if (!Character.isLetter(codFisc.charAt(8))) {
            throw new Exception("Nona lettera errata");
        }

        for (int i = 9; i < 11; i++) {
            if (!Character.isDigit(codFisc.charAt(i))) {
                throw new Exception("Ultime cifre sbagliate");
            }
        }

        this.codFisc = codFisc;
    }

    public int calcolaEta() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate nascita = LocalDate.parse(this.dataDiNascita, formatter);

        LocalDate oggi = LocalDate.now();

        Period periodo = Period.between(nascita, oggi);

        return periodo.getYears();
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public String getCodFisc() {
        return codFisc;
    }

}
