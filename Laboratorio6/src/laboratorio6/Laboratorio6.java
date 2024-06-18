/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio6;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5,"Rojo");
        Rectangulo rectangulo1 = new Rectangulo(2,3,"Azul");
        Cuadrado cuadrado1 = new Cuadrado(5,"Amarillo");
        Triangulo triangulo1 = new Triangulo(1,2,3,"Verde");
        
        System.out.println("Area del circulo: "+circulo1.getArea());
        System.out.println("Area del rectangulo: "+rectangulo1.getArea());
        System.out.println("Area del cuadrado: "+cuadrado1.getArea());
        System.out.println("Area del triangulo: "+triangulo1.getArea());
    }
    
}
