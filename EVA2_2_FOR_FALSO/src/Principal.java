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
        //IMPRIMIR LO NUMEROS DEL 5 AL 1
        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        
        fakeForDown(10);
        
        System.out.println("");
        fakeFor(5, 15);
    }
    
    public static void fakeForDown(int iVal) {
        System.out.print(iVal + " - "); //accion
        iVal--;
        
        if(iVal >= 1) { //condicion para terminar
            fakeForDown(iVal); //llamada recursiva
        }
    }
    
    public static void fakeFor(int iIni, int iFin) {
        System.out.print(iIni + " - ");
        iIni++;
        
        if(iIni <= iFin) {
            fakeFor(iIni, iFin);
        }
    }
}
