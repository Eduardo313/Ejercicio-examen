/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.de.examen;

/**
 *
 * @author Best Buy Uptown
 */
public class EjercicioDeExamen {
    private static String nombre;
    private static int cantidadUsuarios;
    private static Integer tiempo;
    private static String nivel;
    private static int estrella;
    
    public EjercicioDeExamen(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella){
        EjercicioDeExamen.nombre=nombre;
        EjercicioDeExamen.cantidadUsuarios=cantidadUsuarios;
        EjercicioDeExamen.estrella=estrella;
        EjercicioDeExamen.tiempo=tiempo;        
        EjercicioDeExamen.nivel=nivel;
    }
    /**
     * @param args the command line arguments
     */
    public static int calidad(){
        return cantidadUsuarios*tiempo*estrella;
    }
    public static void main(String[] args) {
        EjercicioDeExamen miExamen =new EjercicioDeExamen("meet",40,2,"libre",5);
        System.out.println(calidad());
        // TODO code application logi here
    }
    
}
