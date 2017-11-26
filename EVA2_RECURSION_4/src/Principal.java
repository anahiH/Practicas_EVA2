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
        System.out.println(clean("yyyyyyyytttttttttttttttteeeeeeeeeepppppppppp"));
    }
    
    public static String clean(String letras) {
        String prefix;
        if(letras.length() == 0 || letras.length() == 1) {
            return letras;
        } else {
            prefix = letras.charAt(1) == letras.charAt(0) ? "" : letras.substring(0, 1);
        }
        return prefix + clean(letras.substring(1));
    }
    
}
