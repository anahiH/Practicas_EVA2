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
        int dvdn = 180;
        int dvs = 48;
        System.out.println("El mcd de: " + dvdn+ " y " + dvs + " es " + gcd(dvdn, dvs));
        
    }
    
    public static int gcd(int dvdn, int dvs) {
        int plh;
        if(dvs == 0) {
            return dvdn;
        } else {
            plh = dvs;
            dvs = dvdn%dvs;
            dvdn = plh;
            return gcd(dvdn, dvs);
        }
    }
    
}
