
import java.text.Collator;
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
//ORDENAR POR SALARIO, EDAD, SEXO, POR APELLIDO-EDAD, POR APELLIDO(FINALIZADO)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <persona> llpersonas = new LinkedList();
        llpersonas.add(new persona("anahi", "hinojos", 19, false, 3000));
        llpersonas.add(new persona("juan", "ramirez", 56, true, 67000));
        llpersonas.add(new persona("olivia", "varela", 58, false, 42000));
        llpersonas.add(new persona("ruth", "perez", 26, false, 20000));
        llpersonas.add(new persona("ramona", "ordoñez", 89, false, 583000));
        llpersonas.add(new persona("anahi", "hija", 35, true, 789000));
        
       /* for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }*/
       
        
        Comparator cmCriterio = new Comparator() {//clase anonima, cuando se usar solo una vez
            @Override
            public int compare(Object o1, Object o2) {
                persona p1 = (persona)o1;
                persona p2 = (persona)o2;
                String apellido1, apellido2;
                apellido1 = p1.getApellido();
                apellido2 = p2.getApellido();
                return Collator.getInstance().compare(apellido1, apellido2);
            }
             
        };
        
        System.out.println("LISTA ORDENADA POR APELLIDO");
        
        Collections.sort(llpersonas, cmCriterio);
        
        for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }
        
        Comparator edadCrit = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1 = (persona)o1;
                persona p2 = (persona)o2;
                int edad1, edad2;
                edad1 = p1.getEdad();
                edad2 = p2.getEdad();
                return edad1 - edad2;
            }
            
        };
        
        System.out.println("LISTA ORDENADA POR EDAD");
        
        Collections.sort(llpersonas, edadCrit);
        
        for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }
        
        Comparator salCrit = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1 = (persona)o1;
                persona p2 = (persona)o2;
                double sal1, sal2;
                sal1 = p1.getSalario();
                sal2 = p2.getSalario();
                return (int)(sal1 - sal2);
            }
            
        };
        
        System.out.println("LISTA ORDENADA POR SALARIO");
        
        Collections.sort(llpersonas, salCrit);
        
        for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }
        
        Comparator sexCrit = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1 = (persona)o1;
                persona p2 = (persona)o2;
                boolean sex1, sex2;
                sex1 = p1.isSexo();
                sex2 = p2.isSexo();
                int sexj1 = (sex1 == true) ? 1:0;
                int sexj2 = (sex2 == true) ? 1:0;
                return sexj1 - sexj2;
            }
            
        };
        
        System.out.println("LISTA ORDENADA POR SEXO");
        
        Collections.sort(llpersonas, sexCrit);
        
        for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }
        
        Comparator ApEdad = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1 = (persona)o1;
                persona p2 = (persona)o2;
                String apellido1, apellido2;
                apellido1 = p1.getApellido();
                apellido2 = p2.getApellido();
                int edad1, edad2;
                edad1 = p1.getEdad();
                edad2 = p2.getEdad();
                char c1, c2;
                c1 = apellido1.charAt(0);
                c2 = apellido2.charAt(0);
                if(p1.getNombre().compareTo(p2.getNombre()) == 0) {
                    return edad1 - edad2;
                } else {
                    return Collator.getInstance().compare(apellido1, apellido2);
                }
                
                
            }
        };
        
        System.out.println("LISTA ORDENADA POR APELLIDO Y EDAD");
        
        Collections.sort(llpersonas, ApEdad);
        
        
        for(persona llpersona: llpersonas) {
            System.out.println("Nombre: " + llpersona.getNombre() + "\n" +
                    "Apellido: " + llpersona.getApellido() + "\n" +
                    "Edad: " + llpersona.getEdad() + "\n" + 
                    "Sexo:" + llpersona.isSexo() + "\n" + 
                    "Salario: " + llpersona.getSalario() + "\n");
        }
        
    }
    
}

class persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean sexo;
    private double salario;

    public persona(String nombre, String apellido, int edad, boolean sexo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
