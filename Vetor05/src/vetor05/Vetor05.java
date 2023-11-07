/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]= new int[20]; // Define a quantidade de índices.
        Arrays.fill(v, 5); // Declarar o valor que será repetido, em todos os vetores.
        for (int valor : v) {
            System.out.print(valor + "/ ");
        }
    }

}
