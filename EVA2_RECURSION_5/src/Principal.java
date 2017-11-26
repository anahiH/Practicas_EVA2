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
        System.out.println(par("(()))"));
    }
    
    public static boolean par(String par) {
        boolean o = true;
        if(par.length() == 0) {
            return o;
        } else {
            if(par.length() == 0) {
                return o;
            } else if(par.length() == 1) {
                o = false;
                return o;
            }
        }
        return par(par.substring(1, par.length()-1));
    }
}
