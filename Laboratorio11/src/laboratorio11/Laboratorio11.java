/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio11;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Rojo", 3, 4, 5, 5, 5);
        Circle circle = new Circle("Azul", 7);
        Rectangle rectangle = new Rectangle("Verde", 6, 8);
        Hexagon hexagon = new Hexagon("Negro", 4);

        Figure[] figures = {triangle, circle, rectangle, hexagon};

        for (Figure figure : figures) {
            System.out.println("Figura: " + figure.getClass().getSimpleName());
            System.out.println("Color: " + figure.getColor());
            System.out.println("Perímetro: " + figure.perimeter());
            System.out.println("Área: " + figure.area());
            System.out.println();
        }
    }
    
}
