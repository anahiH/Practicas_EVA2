
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
        // TODO code application logic here
        try {
          arbol armiArbol = new arbol();
          armiArbol.agregarNuevoNodo(new nodo(100));
          armiArbol.agregarNuevoNodo(new nodo(101));
          armiArbol.agregarNuevoNodo(new nodo(97));
          armiArbol.agregarNuevoNodo(new nodo(80));
          armiArbol.agregarNuevoNodo(new nodo(115));
          armiArbol.agregarNuevoNodo(new nodo(114));
          //armiArbol.agregarNuevoNodo(new nodo(114)); SACA UN ERROR
          
          armiArbol.Preorden();
            System.out.println("");
          armiArbol.inorden();
            System.out.println("");
            armiArbol.posorden();
            System.out.println("");
            armiArbol.findValue(8);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

class nodo {
    private int iVal;
    private nodo nIzq;
    private nodo nDer;

    public nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;
    }

    public nodo(int iVal) {
        this.iVal = iVal;
        nIzq = null;
        nDer = null;
    }

    public nodo(int iVal, nodo nIzq, nodo nDer) {
        this.iVal = iVal;
        this.nIzq = nIzq;
        this.nDer = nDer;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(nodo nIzq) {
        this.nIzq = nIzq;
    }

    public nodo getnDer() {
        return nDer;
    }

    public void setnDer(nodo nDer) {
        this.nDer = nDer;
    }
    
    
}

class arbol {
    private nodo nRoot;
    
    public arbol() {
        nRoot = null;
    }
    
    public arbol(nodo Nnodo) {
        nRoot = Nnodo;
    }
    
    public void agregarNuevoNodo(nodo n) throws Exception{
        agregarNodo(nRoot, n);
    }
    
    public void agregarNodo(nodo ini, nodo n) throws Exception {
        if(nRoot == null) {
            nRoot = n;
        } else {
            if(n.getiVal() < ini.getiVal()) { //menor que ini
                if(ini.getnIzq() == null) { //posicion vacia aqui va
                    ini.setnIzq(n);
                } else { //posicion con un nodo
                    ini = ini.getnIzq();
                    agregarNodo(ini, n);
                }
            } else if(n.getiVal() > ini.getiVal()) { //mayor que ini
                if(ini.getnDer() == null) { //posicion vacia aqui va
                    ini.setnDer(n);
                } else { ////posicion en un nodo
                    ini = ini.getnDer();
                    agregarNodo(ini, n);
                }
            } else { //igual que ini
                throw new Exception("No aceptamos valores repetidos");
            }
        }
    }
    
    public void Preorden() {
        impPo(nRoot);
    }
    
    public void impPo(nodo ini) {
        if(ini != null) {
            System.out.print(ini.getiVal() + " - "); //visitar el nodo
            impPo(ini.getnIzq()); //recorrer el lado izquierdo
            impPo(ini.getnDer()); //recorrer el lado derecho
        }
    }
    
    public void inorden() {
        impino(nRoot);
    }
    
    public void impino(nodo ini) {
        if(ini != null) {
            impino(ini.getnIzq());
            System.out.print(ini.getiVal() + " - ");
            impino(ini.getnDer());
        }
    }
    
    public void posorden() {
        imPos(nRoot);
    }
    
    public void imPos(nodo ini) {
        if(ini != null) {
            imPos(ini.getnIzq());
            imPos(ini.getnDer());
            System.out.print(ini.getiVal() + " - ");
        }
    }
    
    public void findValue(int v) {
        System.out.println(findValue1(nRoot, v));
    }
    
    public boolean findValue1(nodo ini, int v) {
        if(ini == null) {
            return false;
        } else {
            return ini.getiVal() == v ||
                    findValue1(ini.getnIzq(), v) ||
                            findValue1(ini.getnDer(), v);
        }
    }
}
