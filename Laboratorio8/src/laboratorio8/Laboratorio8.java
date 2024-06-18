/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio8;

import java.io.IOException;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LecturaNumeros lector = new LecturaNumeros();

        try {
            System.out.println("Introduce 2 números enteros:");
            int num1 = lector.readInt();
            int num2 = lector.readInt();
            
            System.out.println("Introduce un número entero (como Integer):");
            Integer num3 = lector.readInteger();
            
            System.out.println("Introduce un número decimal:");
            double num4 = lector.readDouble();
            
            System.out.println("Introduce un número decimal (como Double):");
            double num5 = lector.readDouble();

            System.out.println("Números introducidos:");
            System.out.println("Número entero 1: " + num1);
            System.out.println("Número entero 2: " + num2);
            System.out.println("Número entero (Integer): " + num3);
            System.out.println("Número decimal: " + num4);
            System.out.println("Número decimal (Double): " + num5);

        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
    
}
