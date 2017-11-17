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
        listaDE vacLista = new listaDE();
        vacLista.imprimirEl();
        vacLista.imprimirIn();
        
        for(int i = 0; i < 10; i++) {
            vacLista.agregarNodo(new nodo((int)(Math.random()*100) + 1));
        }
        
        System.out.println("");
        vacLista.imprimirEl();
        System.out.println("");
        vacLista.imprimirIn();
        
        vacLista.agregarNodo(new nodo(89));
        System.out.println("");
        vacLista.find(89);
        System.out.println("");
        vacLista.imprimirEl();
        
       vacLista.remove(2);
        System.out.println("");
        vacLista.imprimirEl();
        
        vacLista.insertarEn(4, new nodo(96));
        System.out.println("");
        vacLista.imprimirEl();
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

class listaDE {
    private nodo nIni;
    private nodo nFin;
    
    public listaDE() {
        nIni = null;
        nFin = null;
    }
    
    public listaDE(nodo inodo) {
        nIni = inodo;
        nFin = inodo;
    }
    
    public void agregarNodo(nodo Nodo) { //agregar un nodo al final de la lista
        if(nIni == null) {
            nIni = Nodo;
            nFin = Nodo;
        } else {
            nFin.setnSig(Nodo);
            Nodo.setNprev(nFin);
            nFin = Nodo;
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
    
    public void imprimirIn() {
        nodo nTemp = nFin;
        if(nFin == null) {
            System.out.println("La lista está vacia");
        } else {
            while(nTemp != null) {
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getNprev();
          }
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
    
    public void insertarEn(int pos, nodo Nodo) {
        if(pos == 0) {
            Nodo.setnSig(nIni);
            nIni.setNprev(Nodo);
            nIni = Nodo;
        } else {
            nodo nTemp1 = nIni;
            for(int i = 0; i < (pos-1); i++) {
                nTemp1 = nTemp1.getnSig();
            }
            Nodo.setnSig(nTemp1.getnSig());
            Nodo.setNprev(nTemp1);
            nTemp1.setnSig(Nodo);
            Nodo.getnSig().setNprev(Nodo);
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
    
    public void remove(int pos) {
        nodo nTemp = nIni;
        if(pos == 0) {
            nIni = nIni.getnSig();
            nIni.setNprev(null);
        } else {
            for(int i = 0; i < (pos -1); i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
            nTemp.getnSig().setNprev(nTemp);
        }
    }
}

