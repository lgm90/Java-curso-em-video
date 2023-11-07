/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author lucas
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main (String[] args){
        System.out.println("Comecou o programa...");
        int sm = soma(4,6);
        System.out.println("A soma vale " + sm);
    }
    
}
