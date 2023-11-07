/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor02;

/**
 *
 * @author lucas
 */
public class RepeticaoFor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 1; cc <= 3; cc++) {
            System.out.println("---EXTERNO" + cc + "---");
            for (int cc1 = 0; cc1 <= 2; cc1++) {
                System.out.println("   Interno" + cc1);
            }
        }
    }
}
