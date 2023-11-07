/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarnumeros;

/**
 *
 * @author lucas
 */
public class ContarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Usando o (continue)
        int cc = 6;
        while (cc < 16) {
            cc++;
            if (cc == 8 || cc == 9) {
                continue;
            }

            //Usando o (break)
            if (cc == 14) {
                break;
            }
            System.out.println(" Nr" + cc);
        }
    }

}
