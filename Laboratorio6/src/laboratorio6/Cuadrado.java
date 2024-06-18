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
public class Cuadrado {
    private double lado;
    private String color;

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    private double area() {
        return lado * lado;
    }

    private double perimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    public String getColor() {
        return color;
    }
}
