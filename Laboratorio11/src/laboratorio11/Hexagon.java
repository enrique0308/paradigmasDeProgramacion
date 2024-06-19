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
class Hexagon implements Figure {
    private String color;
    private double side;

    public Hexagon(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    @Override
    public double area() {
        return 1.5 * Math.sqrt(3) * side * side;
    }
}