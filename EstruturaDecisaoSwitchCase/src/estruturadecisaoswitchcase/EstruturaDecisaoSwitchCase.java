/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturadecisaoswitchcase;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class EstruturaDecisaoSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int DiaSemana = teclado.nextInt();
        String tipo;
        System.out.print("o dia da semana eh: ");
        switch (DiaSemana) {
            case 1:
                tipo = "Domingo";
                System.out.println(tipo);
                break;
            case 2:
                tipo = "Segunda-feira";
                System.out.println(tipo);
                break;
            case 3:
                tipo = "Terca-feira";
                System.out.println(tipo);
                break;
            case 4:
                tipo = "Quarta-feira";
                System.out.println(tipo);
                break;
            case 5:
                tipo = "Quinta-feira";
                System.out.println(tipo);
                break;
            case 6:
                tipo = "Sexta-feira";
                System.out.println(tipo);
                break;
            case 7:
                tipo = "Sábado";
                System.out.println(tipo);
                break;
            default:
                tipo = "Numero invalido";
                System.out.println(tipo);
                break;
        }
    }
}
