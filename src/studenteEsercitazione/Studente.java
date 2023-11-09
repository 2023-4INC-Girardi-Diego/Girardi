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

    public Studente(String nome, String cognome) throws Exception {
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente studente) throws Exception {
        if (studente.nome == null || studente.cognome == null && studente.nome.isEmpty() || studente.cognome.isEmpty()) {
            throw new Exception("Lo studente non può essere nullo.");
        }
        setNome(studente.nome);
        setCognome(studente.cognome);
    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setCognome(String cognome){

        this.cognome = cognome;

    }

    public char primaLettera() {

        return this.nome.charAt(0);

    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String toString() {
        return "\n" + nome + " " + cognome;
    }
}
