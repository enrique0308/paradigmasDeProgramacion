/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12042024;

/**
 *
 * @author ENRIQUE
 */
public class Ejercicio12042024 {

    /**
     * @param args the command line arguments
     */
    // Método principal para probar la clase Persona
    public static void main(String[] args) {
        // Crear una persona usando el constructor con parámetros
        Persona persona1 = new Persona("Ana", 30, 'F', 1.65, 55.5);

        // Mostrar detalles de la persona
        persona1.mostrarDetalles();

        // Cambiar algunos atributos usando métodos set
        persona1.setEdad(31);
        persona1.setPeso(56.0);

        // Mostrar detalles actualizados
        System.out.println("\nDetalles actualizados:");
        persona1.mostrarDetalles();
    }
    
}
