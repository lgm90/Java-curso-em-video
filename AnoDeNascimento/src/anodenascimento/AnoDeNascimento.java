/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anodenascimento;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AnoDeNascimento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano do seu nasc.: ");
        int ano = teclado.nextInt();
        System.out.print("Digite o ano atual: ");
        int atual = teclado.nextInt();
        int idade = atual - ano;
        System.out.println("Sua idade eh: " + idade + " anos");
    }
}
