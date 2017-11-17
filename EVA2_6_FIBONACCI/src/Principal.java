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
    static int con = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int u = 14;
        //System.out.println("fibo de " + u + " es " + fibo(u));
        for(int i = 0; i <= u; i++) {
            System.out.print(fibo(i) + " - ");
        }
    }
    
    public static int fibo(int veces) {
        con++;
        //System.out.println(con);
        /*if(veces == 0) {
            return 0;
        }
        
        else if (veces == 1){
            return 1;
        }
        else {
            return fibo(veces -1) + fibo(veces -2);
        }*/
        switch(veces) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibo(veces -1) + fibo(veces -2);
        }
    }
    
}
