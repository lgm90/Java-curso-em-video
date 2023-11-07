/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author lucas
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int mesNum[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int c = 0; c < mes.length; c++) {
            System.out.println("Mes " + mesNum[c]+ " eh " + mes[c]);
        }    
    }
    
}
