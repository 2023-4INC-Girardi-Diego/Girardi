/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlli;

/**
 *
 * @author diego.girardi
 */
public class Controlli {

    String id;

    public final void setId(String id) throws Exception {
        char[] idchar = new char[2];
        String idnum;
        try {
            if (!id.isEmpty()) {
                if (id.length() == 4) {
                    idchar = id.substring(0, 2).toCharArray();
                    idnum = id.substring(2);
                    Integer.parseInt(idnum);
                    for (int i = 0; i < 2; i++) {
                        if (!Character.isLetter(idchar[i])) {
                            throw new Exception("L'id contiene un carattere non valido");
                        }
                    }
                    this.id = id;
                } else {
                    throw new Exception("La lunghezza dell'id non è valida");
                }
            } else {
                throw new Exception("id vuoto");
            }
        } catch (NullPointerException peppe) {
            throw new NullPointerException(peppe.toString());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("L'id contiene un carattere non valido");
        }
    }
}
