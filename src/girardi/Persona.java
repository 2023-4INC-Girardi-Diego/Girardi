/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girardi;

/**
 *
 * @author Utente
 */
public class Persona {

    private String cognome;
    private String nome;
    private Data dataDiNascita;
    static protected int numeroIstanze;

    public Persona() {
    }

    public Persona(String cognome, String nome, Data dataDiNascita) throws Exception {
        controlloNominativi(nome);
        this.nome = nome;
        controlloNominativi(cognome);
        this.cognome = cognome;
        setDataDiNascita(dataDiNascita);
        addIstanza();

    }

    private void addIstanza() {
        this.numeroIstanze++;
    }

    public void setNome(String nome) throws Exception {

    }

    public void setCognome(String cognome) throws Exception {

    }

    public void setDataDiNascita(Data dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public String getCognome() {
        return cognome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    private void controlloNominativi(String nominativo) throws Exception {

        if (nominativo.isEmpty()) {
            throw new Exception("il cognome o nome è vuoto");
        }

        for (int i = 0; i < nominativo.length(); i++) {
            if (!Character.isLetter(nominativo.charAt(i))) {
                throw new Exception("il cognome o nome non può contenere numeri");
            }
        }

        if (!Character.isUpperCase(nominativo.charAt(0))) {
            throw new Exception("La prima lettere del cognome o nome deve essere maiuscola");
        }
    }

    public boolean verificaOmonimia(Persona persona) {

        boolean omonimia = false;

        if (this.nome.equals(persona.getNome()) && this.cognome.equals(persona.getCognome())) {
            omonimia = true;
        }

        return omonimia;
    }

    public int calcolaEta() throws Exception {

        Data oggi = new Data();

        return Data.differenzaInAnni(this.dataDiNascita, oggi);
    }

    public String info() throws Exception {

        if (this.cognome != null && this.nome != null && this.dataDiNascita != null) {
            return "Cognome       : " + this.cognome
                    + "\nNome          : " + this.nome
                    + "\nDataDiNascita : " + this.dataDiNascita.toString();
        } else {
            throw new Exception("almeno uno degli attributi è null!");
        }

    }

}
