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
     */public static int charpo = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(quitarx("xxxoooooxxx"));
        
        
    }
    
    public static String quitarx(String letras) {
        String prefix;
        if (letras.length() == 0) {
            return letras;
        }
        else {
           prefix = letras.startsWith("x") ? "" : letras.substring(0, 1);
        }
        return prefix + quitarx(letras.substring(1));
    }
}
