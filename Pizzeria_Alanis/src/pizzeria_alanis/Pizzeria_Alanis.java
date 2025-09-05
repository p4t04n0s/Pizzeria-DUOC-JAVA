/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria_alanis;

/**
 *
 * @author Duoc
 */
public class Pizzeria_Alanis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=== Bienvenidos a la Pizzeria Alanis ===\n");
        
       
        //creaamos el objeto pizza, ya tenieno la plantilla lista
        Pizza pizza1 = new Pizza("Pepperoni","Mediana","Delgada");
        
        String nombre = pizza1.getNombre();
        String tamaño = pizza1.getTamaño();
        String masa = pizza1.getMasa();
        
        System.out.println("Usted ha comprado una pizza: ==> "+nombre+", ==> Tamano: "+tamaño+(", ==> Masa: ")+masa);
        
       
        //opcion para poder modificar un dato o varios datos de un objeto ya creado
        pizza1.setTamaño("Grande");
        pizza1.setNombre("Vegetariana");
        pizza1.setMasa("Gruesa");
        System.out.println("Usted ha comprado una pizza: ==> "+pizza1.getNombre()+", ==> Tamano: "+pizza1.getTamaño()+(", ==> Masa: ")+pizza1.getMasa());
        
    }
    
}
