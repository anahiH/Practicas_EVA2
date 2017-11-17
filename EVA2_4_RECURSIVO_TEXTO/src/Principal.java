/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550467
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for(int i = 1; i <= 10; i++) {
            System.out.println(cadenaRecursiva(i));
        }
        
        for(int i = 9; i >= 1; i--) {
            System.out.println(cadenaRecursiva(i));
        }*/
        
        int j = 10;
        int u = j - (j-1);
        while(j >= 1 || j <= 10) {
            while(u <= 10) {
              System.out.println(cadenaRecursiva(u));
              u++;
            }
            
            while(j >= 1) {
              System.out.println(cadenaRecursiva(j));
              j--;  
            }
            if(u == 11 && j == 0) {
                break;
            }
        }
        
    }
    
    public static String cadenaRecursiva(int iNum) {
        if(iNum > 1) {
            return "*" + cadenaRecursiva(iNum -1);
        } else {
            return "*";
        }
    }
    
}
