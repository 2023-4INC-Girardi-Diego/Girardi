/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Utente
 */
public class Persona {

    private static int numeroIstanze = 0;
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception {
        setCognome(cognome);
        setNome(nome);
        this.codFisc = codFisc;
        this.dataDiNascita = dataDiNascita;
        addIstanza();
    }

    private void addIstanza() {
        numeroIstanze++;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public void setNome(String nome) throws Exception {

        if (nome.isEmpty() || nome.charAt(0) > 65 && nome.charAt(0) < 90) {
            this.nome = nome;
        } else {
            throw new Exception("la prima lettere deve essere maiuscola o nome vuoto");
        }

    }

    public void setCognome(String cognome) throws Exception {

        if (cognome.isEmpty() || cognome.charAt(0) > 65 && cognome.charAt(0) < 90) {
            this.cognome = cognome;
        } else {
            throw new Exception("la prima lettere deve essere maiuscola o cognome vuoto");
        }

    }

}
