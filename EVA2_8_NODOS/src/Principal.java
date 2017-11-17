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
        nodo Obj1 = new nodo();
        Obj1.iVal = 100;
        
        nodo Obj2 = new nodo();
        Obj2.iVal = 200;
        
        nodo Obj3 = new nodo();
        Obj3.iVal = 300;
        
        //vincular los nodos
        //obj1 --> obj2 --> obj3
        Obj1.nSig = Obj2; //copia la ubicacion del objeto 2 en nsig, no es una copia del nodo en si
        Obj2.nSig = Obj3;
        
        /*System.out.println(Obj1.iVal);
        System.out.println(Obj2.iVal);
        System.out.println(Obj3.iVal);*/
        
        //si no se sabe el num de objetos
        nodo nMover = Obj1;
        while(nMover != null) {
            System.out.println(nMover.iVal);
            nMover = nMover.nSig;
        }
    }
    
}

class nodo {
    public int iVal;
    public nodo nSig;
    public nodo() {
        nSig = null;
    }
}
