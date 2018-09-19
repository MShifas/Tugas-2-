/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author Nuser
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == (n - 1) || j == 0 || j == (n - 1) || i == 0) {
                    System.out.print("#");

                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }

    }

}
