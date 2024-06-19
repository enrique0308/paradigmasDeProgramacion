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
class Hexagon extends Figure {
    private double side;

    public Hexagon(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double perimetro() {
        return 6 * side;
    }

    @Override
    public double area() {
        return 1.5 * Math.sqrt(3) * side * side;
    }
}
