/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float nota1 = 8.5f;
        System.out.println("A nota1 e " + nota1);
        
        // Nota com Typecast
        float nota2 = (float)7.5f; 
        System.out.println("A nota2 e " + nota2);
        
        // Usando o printf para formatar o resultado
        String nome = "Lucas";
        float nota3 = 9.6f; 
        System.out.printf("A nota3 de %s e %.3f \n", nome,nota3);
        
        // Usando o System.out.format para formatar o resultado
        String nome2 = "Tereza";
        float nota4 = 4.3f; 
        System.out.format("A nota4 de %s e %.5f \n", nome2,nota4);
        
        //Configurando para entrada de dados
        Scanner teclado = new Scanner(System.in);
     
        System.out.print("Digite o nome do aluno: ");
        String nome3 = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        float nota5 = teclado.nextFloat();
        
        System.out.format("A nota5 de %s e %.2f \n", nome3,nota5);
    }
    
}
