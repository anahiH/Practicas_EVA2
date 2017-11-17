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
        queue gFilaSuper = new queue();
        System.out.println(gFilaSuper.leerPrimerNodo());
        
        gFilaSuper.agregarNodo(new nodo(100));
        gFilaSuper.agregarNodo(new nodo(200));
        gFilaSuper.agregarNodo(new nodo(300));
        gFilaSuper.agregarNodo(new nodo(400));
        
        System.out.println(gFilaSuper.leerPrimerNodo());
        System.out.println(gFilaSuper.contarNodos());
    }
    
}

class nodo {
    public int iVal;
    private nodo nSig;
    private nodo nprev;
    
    public nodo() {
        iVal = 0;
        nSig = null;
        nprev = null;
    }
    
    public nodo(int num) {
        iVal = num;
        nSig = null;
        nprev = null;
    }
    
    public nodo(int num, nodo j) {
        iVal = num;
        nSig = j;
        nprev = null;
    }
    
    public nodo(int num, nodo j, nodo g) {
        iVal = num;
        nSig = j;
        nprev = g;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public nodo getnSig() {
        return nSig;
    }

    public void setnSig(nodo nSig) {
        this.nSig = nSig;
    }

    public nodo getNprev() {
        return nprev;
    }

    public void setNprev(nodo nprev) {
        this.nprev = nprev;
    }
}

class queue {
    private nodo nIni;
    private nodo nFin;
    
    public queue() {
        nIni = null;
        nFin = null;
    }
    
    public queue(nodo inodo) {
        nIni = inodo;
        nFin = inodo;
    }
    
    public void agregarNodo(nodo NODO) {
        if(nIni == null) {
            nIni = NODO;
            nFin = NODO;
        } else {
            nFin.setnSig(NODO);
            NODO.setNprev(nFin);
            nFin = NODO;
        }
    }
    
    public int leerPrimerNodo() {
        int num = 0;
        if(nIni == null) {
            //lanzar una excepcion
            num = 0; //ojo: cero es un entero valido, siempre es mejor lanzar una excepcion
        } else {
            num = nIni.getiVal();
        }
        return num;
    }
    
    public void removerPrimerNodo() {
        int num = 0;
        if(nIni == null) {
            //lanzar una excepcion
            num = 0; //ojo: cero es un entero valido, siempre es mejor lanzar una excepcion
        } 
       
        else {
            //eliminar el primer nodo de la lista
            //verificar cantidad de nodos // si solo hay un nodo nini = null, nfin = null
            if(nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                //si hay mas nodos, reconectar
                nIni = nIni.getnSig();
                nIni.setNprev(null);
            }
        }
        
    }
    
    public int contarNodos() {
        nodo nTemp = nIni;
        int contador = 0;
        if(nIni == null) {
            return 0;
        } else {
            while(nTemp != null) {
                nTemp = nTemp.getnSig();
                contador++;
            }
            return contador;
        }
    }
    
    public void vaciarL() {
        if(nIni == null) {
            System.out.println("La lista está vacia");
        } else {
            nIni = null;
            nFin = null;
        }
    }
    
   public int valorEn(int pos) throws Exception{
        //verificar si la posicion es menor que el tamaño del arreglo
      int valor = 0;
      if((pos < contarNodos()) && (pos >= 0)) {
          nodo nTemp = nIni;
          for(int i = 0; i < pos; i++) {
              nTemp = nTemp.getnSig();
          }
          valor = nTemp.getiVal();
      } else {
          throw new Exception("La posición no es válida.");
      }
      return valor;
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
        while(nTemp.getiVal() != num && nTemp.getnSig() != null) {
            nTemp = nTemp.getnSig();
            contador++;
        }
        System.out.println("El elemento " + num + " está en la posición " + contador);
    }
    
    
}
