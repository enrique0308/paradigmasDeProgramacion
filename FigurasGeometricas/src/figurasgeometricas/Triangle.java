/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ENRIQUE
 */
class Triangle extends Figure {
    private double base;
    private double height;
    private double side1, side2, side3;

    public Triangle(String color, double base, double height, double side1, double side2, double side3) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimetro() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

}