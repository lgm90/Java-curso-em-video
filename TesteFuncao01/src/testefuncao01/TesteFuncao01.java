/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author lucas
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
     static void multiplicacao(float a, float b) {
        float s = a * b;
        System.out.println("A multiplicacao eh: " + s);
    }
    
    public static void main (String[] args){
        System.out.println("Comecou o programa...");
        multiplicacao(6,8);
    }
    
}
