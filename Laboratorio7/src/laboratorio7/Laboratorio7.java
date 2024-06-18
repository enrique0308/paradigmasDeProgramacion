/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de un arreglo de 10 objetos Punto3D
        Punto3D[] puntos = new Punto3D[10];
        puntos[0] = new Punto3D(1, 2, 3);
        puntos[1] = new Punto3D(4, 5, 6);
        puntos[2] = new Punto3D(-1, 0, 1);
        puntos[3] = new Punto3D(7, 8, 9);
        puntos[4] = new Punto3D(0, 0, 0);
        puntos[5] = new Punto3D(2, 2, 2);
        puntos[6] = new Punto3D(-3, -3, -3);
        puntos[7] = new Punto3D(5, 5, 5);
        puntos[8] = new Punto3D(-2, -2, -2);
        puntos[9] = new Punto3D(1, 1, 1);

        // Calcular la menor distancia entre todos los puntos
        double menorDistancia = Double.MAX_VALUE;
        Punto3D puntoA = null;
        Punto3D puntoB = null;

        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                double distanciaActual = puntos[i].distancia(puntos[j]);
                if (distanciaActual < menorDistancia) {
                    menorDistancia = distanciaActual;
                    puntoA = puntos[i];
                    puntoB = puntos[j];
                }
            }
        }

        // Mostrar resultados
        System.out.println("La menor distancia encontrada es: " + menorDistancia);
        System.out.println("Entre los puntos:");
        System.out.println("Punto A: (" + puntoA.getX() + ", " + puntoA.getY() + ", " + puntoA.getZ() + ")");
        System.out.println("Punto B: (" + puntoB.getX() + ", " + puntoB.getY() + ", " + puntoB.getZ() + ")");
    }
    
}
