/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Usando estrutura de repetição (Faça)

        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero; // soma = soma + numero
            System.out.print("Quer continuar? [s/n] ");
            resposta = teclado.next();
        } while (resposta.equals("s"));
        System.out.println("A soma de todos os valores é: " + soma);
    }

}
