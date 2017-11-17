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
        System.out.println();
    }
    
    public static int factorial(int iVal) {
        if(iVal > 0) {
            return iVal * factorial(iVal-1);
        }
        else {
            return 1;
        }
        
    }
    
}
