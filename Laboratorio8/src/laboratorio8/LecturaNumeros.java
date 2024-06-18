/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    // Constructores
    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    public LecturaNumeros(Reader r) {
        super(r);
    }

    // Métodos adicionales para lectura numérica
    public int readInt() throws IOException {
        String input = this.readLine();
        return Integer.parseInt(input.trim());
    }

    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return this.readInt();
    }

    public Integer readInteger() throws IOException {
        String input = this.readLine();
        return Integer.valueOf(input.trim());
    }

    public double readDouble() throws IOException {
        String input = this.readLine();
        return Double.parseDouble(input.trim());
    }

    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return this.readDouble();
    }
    
}
