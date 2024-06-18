/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7;

import java.lang.Math;

/**
 *
 * @author ENRIQUE
 */
class Punto3D {
    // Atributos privados
    private double x;
    private double y;
    private double z;

    // Constructores
    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(Punto3D punto) {
        this.x = punto.getX();
        this.y = punto.getY();
        this.z = punto.getZ();
    }

    // Métodos set y get para x, y, z
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Método para calcular la distancia euclidiana entre dos puntos 3D
    public double distancia(Punto3D otroPunto) {
        double dx = this.x - otroPunto.getX();
        double dy = this.y - otroPunto.getY();
        double dz = this.z - otroPunto.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}