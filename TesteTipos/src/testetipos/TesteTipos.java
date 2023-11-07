/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author lucas
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Converter Inteiro para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        // Converter String para inteiro
        String valor1 = "30";
        int idade2 = Integer.parseInt(valor1);
        System.out.println(idade2);
        
        // Converter String para float
        String valor2 = "30.5";
        float idade3 = Float.parseFloat(valor2);
        System.out.printf("%.3f \n", idade3);
    }
    
}
