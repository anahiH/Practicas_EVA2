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
        System.out.println(potencia(3, 54));
    }
    
    public static int potencia(int base, int n) {
        if(n == 0) {
            return 1;        
        }
        else if(n == 1) {
            return base;
        }
        
        else {
            return potencia(base, n-1) * base;
        }
    }
}
