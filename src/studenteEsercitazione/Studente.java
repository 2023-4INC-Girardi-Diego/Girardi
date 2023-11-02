/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenteEsercitazione;

/**
 *
 * @author diego.girardi
 */
public class Studente {

    String nome;
    String cognome;

    public Studente(String nome, String cognome) {
        try {
            setNome(nome);
            setCognome(cognome);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Studente(Studente studente) {
        try {
            setNome(studente.nome);
            setCognome(studente.cognome);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setNome(String nome) throws Exception {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("Il nome non puo essere nullo o vuoto.");
        }
    }

    public final void setCognome(String cognome) throws Exception {
        if (cognome != null && !cognome.isEmpty()) {
            this.cognome = cognome;
        } else {
            throw new Exception("Il cognome non puo essere nullo o vuoto.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "\n" + nome + " " + cognome;
    }

}
