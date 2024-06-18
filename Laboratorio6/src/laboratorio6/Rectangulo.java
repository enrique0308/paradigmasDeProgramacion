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
public class Rectangulo {
    private double base;
    private double altura;
    private String color;

    public Rectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    private double area() {
        return base * altura;
    }

    private double perimetro() {
        return 2 * (base + altura);
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
