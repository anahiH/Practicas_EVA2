
import java.util.Collections;
import java.util.Comparator;
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
        milista.add("hola");
        milista.add("");
        milista.add("mundo");
        milista.add("");
        milista.add("cruel");
        milista.add("");
        milista.add("collections");
        
        for (String milista1 : milista) {
            System.out.print(milista1 + "");
        }
        
        Comparator MComparator = new Comparator() {

            @Override
            public int compare(Object ol, Object o2) {
                String s1, s2;
                s1 = (String)ol;
                s2 = (String)o2;
                char c1, c2;
                c1 = s1.charAt(0);
                c2 = s2.charAt(0);
                return c1 - c2;
            }
        };
        System.out.println("");
        Collections.sort(milista, MComparator);
        System.out.println(milista);
    }
    
}
