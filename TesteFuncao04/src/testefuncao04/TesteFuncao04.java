/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao04;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TesteFuncao04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        Fatorial f = new Fatorial();
        System.out.print("Digite um numero: ");
        f.setValor(teclado.nextInt());
        System.out.print("O fatorial eh: " + f.getFormula());
        System.out.println(f.getfatorail());
    }

}
