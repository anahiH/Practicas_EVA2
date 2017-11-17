
import java.util.Stack;

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
        Stack <Double> Astack = new Stack(); 
        
        Astack.push(20.0);
        Astack.push(18.0);
        Astack.push(17.0);
        Astack.push(50.0);
        Astack.push(66.0);
        
        System.out.println(Astack.pop()+"");
        System.out.println(Astack.pop()+"");
        System.out.println(Astack.peek()+""); 
    }
    
}
