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
        System.out.println(sumarNum(355));
    }
    
    public static int sumarNum(int n) {
        
        if(n == 0) {
            return n;
        } else {
            return n%10 + sumarNum(n/10);
            
        }
    }
}
