
import java.util.LinkedList;

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
        LinkedList <String> milista = new LinkedList();
        
        milista.add("Hola");
        milista.add(" ");
        milista.add("Mundo");
        milista.add(" ");
        milista.add("Cruel ");
        milista.add("Collection");
        
        for(String milista1 : milista) {
            System.out.print( milista1+"");
          }
        
        System.out.println("");
        milista.remove(4);
         
        for(String milista1 : milista) {
            System.out.print( milista1+"");
         }
        
        milista.add(4, "Bueno");
        System.out.println("");
        
        for(String milista1 : milista) {
            System.out.print( milista1+"");
          }
        
        System.out.println("");
        System.out.println("El tamaño de la lista es: "+ milista.size());
        
    }
    
}
