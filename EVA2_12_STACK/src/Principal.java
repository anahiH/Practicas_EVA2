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
    }
    
}

class nodo {
    private int iVal;
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
    
    public nodo(int num, nodo NODO) {
        iVal = num;
        nSig = NODO;
        nprev = null;
    }
    
    public nodo(int num, nodo NODO, nodo nfin) {
        iVal = num;
        nSig = NODO;
        nprev = nfin;
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

class stack {
    private nodo nIni;
    private nodo nFin;
    
    public stack() {
        nIni = null;
        nFin = null;
    }
    
    public stack(nodo nini) {
        nIni = nini;
        nFin = nini;
    }    
    
    public void agregarNodo(nodo N) {
        if(nIni == null) {
            nIni = N;
            nFin = N;
        } else {
            nIni.setNprev(N);
            N.setnSig(nIni);
            nIni = N;
        }
    }
    
    public void pop() {
        if(nIni == null) {
            System.out.println("El stack está vacío.");
        } else {
            nIni = nIni.getnSig();
            nIni.setNprev(null);
        }
    }
    
     public void vaciarLista() {
        nIni = null;
        nFin = null;
    }
    
    public int contarEl() {
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
    
    public int valorEn(int pos) throws Exception {
        int valor = 0;
        if(pos < contarEl() && pos >=0) {
            nodo nTemp = nIni;
            for(int i = 0; i < pos; i++) {
                nTemp = nTemp.getnSig();
            }
            valor = nTemp.getiVal();
        } else {
            throw new Exception("La posición no es válida");
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
            contador++;
            nTemp = nTemp.getnSig();
        }
        if(nTemp.getiVal() == num) {
            System.out.println("El elemento " + num + " está en la posición " + contador);
        } else {
            System.out.println("El elemento no se encontró en la lista");
        }
    }
    
    public void imprimirEl() {
        nodo nTemp = nIni;
        if(nIni == null) {
            System.out.println("La lista está vacia");
        } else {
            while(nTemp != null) {
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getnSig();
           }
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
}
