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
        
        //1 El METODO SE LLAMA A SI MISMO
        //2 DEBE HABER UN MECANISMO PARA DETENER LA RECURSIÓN
        stackOverflow();
    }
    
    public static void stackOverflow() {
        System.out.println("Uops!");
        stackOverflow();
    }
    
}
