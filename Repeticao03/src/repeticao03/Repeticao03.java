/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao03;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Repeticao03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, cc = -1, par = -1, impar = 0, maiorCem = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n (Valor 0 para finalizar)"));

            cc++; //Total de valores digitados.
            if (n % 2 == 0) {
                par++; //Define a quantidade de pares
            } else {
                impar++; //Define a quantidade de impares
            }
            if (n >= 100) {
                maiorCem++; //Define a quantidade de valores digitados maiores que 100
            }
            s += n; //Define o somatório total    

        } while (n != 0);
        
         media = s / cc; //Define a média total
         
        JOptionPane.showMessageDialog(null, "Resultado Final \n ________________\n Total valores: " + cc
                + "\n Total Pares: " + par
                + "\n Total Impar: " + impar
                + "\n Acima de 100: " + maiorCem
                + "\n Somatório vale: " + s
                + "\n Média dos valores: " + media);
    }
    
}
