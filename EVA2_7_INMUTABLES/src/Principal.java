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
        int[] aiDatos = new int[3];
        aiDatos[0] = 9;
        aiDatos[1] = 5;
        aiDatos[2] = 3;
        
        int[] backup = new int[3];
        int i = 0;
        for(int g : aiDatos) { //FOR(INT I = 0; I < AIDATOS.LENGTH; I++)
            System.out.print(g + " ");
            backup[i] = g;
            i++;
        }                
        
        aiDatos = new int[4];
        
        for(int o = 0; o < backup.length; o++) {
            aiDatos[o] = backup[o];
        }
        
        for(int g : aiDatos) {
            System.out.print(g + " ");
        }
    }
    
}
