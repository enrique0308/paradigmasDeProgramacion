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
abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double perimetro();
    public abstract double area();
}
