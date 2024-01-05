/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compitinatale;

/**
 *
 * @author Utente
 */
public class Giocatore {
    
    private String nome;
    private Integer punti;
    static protected int numeroGiocatori = 0;

    public Giocatore(String nome) throws Exception{ 
        setNome(nome);
        addGiocatore();
    }
    
    /**
     * permette di tenere conto di tutte le istanze
     */
    private void addGiocatore(){
        this.numeroGiocatori ++;
    }

    /**
     * controlla che il nome sia inserito secondo alcune specifiche
     * @param nome nome che verrà inserito se rispettate le specifiche
     * @throws Exception bloccherà il codice nel caso in cui le specifiche non siano rispettate ovvero
     * assenza di caratterei alfabetici e la prima letterea maiuscola
     * @return void la funzione non tornerà nulla
     */
    public void setNome(String nome) throws Exception{
        
        for(int i = 0; i<nome.length(); i++){
            if(!Character.isAlphabetic(nome.charAt(i))){
                throw new Exception("il nome contierne altre cose oltre a lettere!");
            }
        }

        if(Character.isUpperCase(nome.charAt(0))){
            this.nome = nome;
        }else{
            throw new Exception("la prima lettera del nome deve essere maiuscola!");
        }
    }
    
    
    
    
    
    

    
}
