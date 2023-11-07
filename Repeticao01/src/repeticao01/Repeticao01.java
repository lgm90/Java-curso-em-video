/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao01;

/**
 *
 * @author lucas
 */
public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
           Usando estrutura de repetição (Enquanto) 
           int cc = 1; 
           while (cc < 10){
           System.out.println("Nr" + cc); 
           cc++;
           }
        */
        
        //Usando estrutura de repetição (Faça)
        int cc = 1;
        do {
            System.out.println("Nr" + cc);
            cc += 2; // cc = cc + 2
        } while (cc < 10);
    }
}
