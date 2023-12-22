/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prove;

/**
 *
 * @author diego.girardi
 */
import java.util.Scanner;

public class Idea {

    private boolean idea;

    public Idea() {

    }

    public void setIdea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lisa ha un idea?: ");
        String txt = scanner.nextLine();
        scanner.close();

        if (txt.equals("si")) {
            System.out.println("male");
        } else {
            System.out.println("bene");
        }
    }

}
