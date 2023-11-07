/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author lucas
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ABAIXO DOIS EXEMPLOS DE COMO CRIAR VETORES
        //USANDO A ESTRUTURA (PARA)
        int n[] = {25, 12, 2023};
        System.out.println("Total de casas de N " + n.length);
        for (int c = 0; c <= 2; c++) {
            System.out.println("Na posicao " + c + " temos o valor " + n[c]);
        }
        System.out.println("------------------------------");

        //USANDO A ESTRUTURA (FAÇA)
        int cc = 0;
        int n2[] = new int[3];
        n2[0] = 31;
        n2[1] = 12;
        n2[2] = 2023;
        System.out.println("Total de N " + n2.length);
        do {
            System.out.println("Na posicao " + cc + " temos o valor " + n2[cc]);
            cc++;
        } while (cc <= 2);
    }
}
