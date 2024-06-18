/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12042024;

/**
 *
 * @author ENRIQUE
 */
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private char genero;
    private double altura;
    private double peso;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, char genero, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos get y set para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para imprimir los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
    }

    
}

