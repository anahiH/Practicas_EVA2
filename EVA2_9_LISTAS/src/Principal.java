
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            // TODO code application logic here
            lista nlista = new lista();
            nlista.imprimirNodo();
            /*System.out.println("");
            nlista.agregarNodo(new nodo(15));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(80));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(45));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(96));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(74));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(85));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(100));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.agregarNodo(new nodo(7));
            nlista.imprimirNodo();
            System.out.println("");
            nlista.vaciarLista();
            nlista.imprimirNodo();*/
            
            for(int i = 0; i < 10; i ++) {
                int iVal = (int)(Math.random() * 1000) + 1;
                nlista.agregarNodo2(new nodo(iVal));
            }
            nlista.imprimirNodo();
            System.out.println("Cantidad de elementos: " + nlista.contarElementos());
            System.out.println("Elemento en posision 6 es " + nlista.valorEn(6));
            
            nlista.insertarEn(0, new nodo(999));
            nlista.imprimirNodo();
            System.out.println("");
            
            nlista.insertarEn(5, new nodo(88));
            nlista.imprimirNodo();
            System.out.println("");
            
            nlista.borrarNodo(3);
            nlista.imprimirNodo();
            System.out.println("");
            
            nlista.find(88);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
class nodo {
    public int iValor;
    private nodo nSig;
    
    public nodo() {
        iValor = 0;
        nSig = null;
        
    }
    
    public nodo(int iVal) {
        iValor = iVal;
        nSig = null;
    }
    
    public nodo(int iVal, nodo j) {
        iValor = iVal;
        nSig = j;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public nodo getnSig() {
        return nSig;
    }

    public void setnSig(nodo nSig) {
        this.nSig = nSig;
    }
    
    
}

class lista {
    private nodo nIni;
    private nodo nFin;
    public lista() {
        nIni = null;
        nFin = null;
    }
    public lista(nodo op) {
        nIni = op;
        nFin = op;
    }
    
    //agregar nodo los coloca al final de la lista
    public void agregarNodo(nodo op) {// NO VOLVER A USAR JAMAS, ES INEFICIENTE
        //meterlo al final de la lista
        nodo nTemp = nIni;
        if(nIni == null) {
            nIni = op; //cuando la lista esta vacia
        } else {
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(op);
        }
    }
      public void agregarNodo2(nodo op) {
        if(nIni == null) {
           nIni = op; //cuando la lista esta vacia
           nFin = op;
        } else {
            nFin.setnSig(op);
            nFin = op;
        }
      }
    public void imprimirNodo() {
        nodo nTemp = nIni;
        if(nIni == null) {
            System.out.println("La lista está vacia");
        } else {
            while(nTemp.getnSig() != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }
    
    //vaciar la lista, AL MENOS PARA JAVA
    public void vaciarLista() {
        nIni = null;
        nFin = null;
    }
    
    //CONTAR LOS ELEMENTOS DE LA LISTA
    public int contarElementos() {
        nodo nTemp = nIni;
        if(nIni == null) {
            return 0;
        } else {
            int contador = 0;
            while(nTemp != null) {
                contador++;
                nTemp = nTemp.getnSig();
            }
            return contador;
        }
    }
    
    //ENCONTRAR ELEMENTOS EN DIFERENTES POSICIONES
    public int valorEn(int pos) throws Exception{
        //verificar si la posicion es menor que el tamaño del arreglo
        int valor = 0;
        if((pos < contarElementos()) && (pos >= 0)) {
            nodo nTemp = nIni;
            for(int i = 0; i < pos; i++) {
                nTemp = nTemp.getnSig();
            }
            valor = nTemp.getiValor();
        } else {
            throw new Exception("La posición no es válida.");
        }
        return valor;
    }
    
    public void insertarEn(int pos, nodo Nnodo) {
        //verificar pos >= 0, pos < tamaño de la lista
        //insertar al inicio de la lista
        if(pos == 0) {
            Nnodo.setnSig(nIni);
            nIni = Nnodo;
        } else { //insertar en cualquier posicion de la lista excepto al final
            nodo nTemp = nIni;
            for(int i = 0; i < (pos -1); i++) {
                nTemp = nTemp.getnSig();
            }
            Nnodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(Nnodo);
        }
    }
    
    public void borrarNodo(int pos) {
        if(pos == 0) {
            nIni = nIni.getnSig();
        } else {
            nodo nTemp = nIni;
            for(int i = 0; i < (pos -1); i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
        }
    }
    
    public boolean isEmpty() {
        if(nIni == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void find(int num) {
        nodo nTemp = nIni;
        int contador = 0;
        while(nTemp.getiValor() != num && nTemp.getnSig() != null) {
            nTemp = nTemp.getnSig();
            contador++;
        }
        System.out.println("El elemento " + num + " está en la posición " + contador);
    }
}
