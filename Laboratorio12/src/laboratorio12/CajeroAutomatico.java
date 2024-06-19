/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ENRIQUE
 */
public class CajeroAutomatico {

    private static final int EFECTIVO_INICIAL = 100000;  // Efectivo inicial del cajero
    private int efectivoDisponible;                      // Efectivo disponible actualmente

    // Mapa para simular una base de datos de cuentahabientes (para propósitos de ejemplo)
    private Map<String, Cuenta> cuentahabientes;

    // Constructor del cajero
    public CajeroAutomatico() {
        this.efectivoDisponible = EFECTIVO_INICIAL;
        this.cuentahabientes = new HashMap<>();

        // Ejemplo de cuentahabientes predefinidos (se simula una base de datos)
        // Aquí se podrían cargar desde una base de datos real en una implementación más avanzada
        cuentahabientes.put("123456", new Cuenta("123456", "Juan Pérez", 50000));
        cuentahabientes.put("789012", new Cuenta("789012", "María López", 75000));
    }

    // Método para autenticar a un cuentahabiente
    public boolean autenticarCuentahabiente(String numeroCuenta) {
        return cuentahabientes.containsKey(numeroCuenta);
    }

    // Método para desplegar datos de cuenta y saldo
    public void mostrarDatosCuenta(String numeroCuenta) {
        if (autenticarCuentahabiente(numeroCuenta)) {
            Cuenta cuenta = cuentahabientes.get(numeroCuenta);
            System.out.println("Datos de cuenta:");
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Titular de la cuenta: " + cuenta.getTitular());
            System.out.println("Saldo disponible: $" + cuenta.getSaldo());
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    // Método para realizar depósito en efectivo a cuenta propia
    public void depositoEnEfectivo(String numeroCuenta, int monto) {
        if (autenticarCuentahabiente(numeroCuenta)) {
            Cuenta cuenta = cuentahabientes.get(numeroCuenta);
            cuenta.depositar(monto);
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    // Método para realizar depósito en efectivo a otras cuentas
    public void depositoEnOtraCuenta(String numeroCuentaOrigen, String numeroCuentaDestino, int monto) throws SaldoEfectivoInsuficiente {
        if (autenticarCuentahabiente(numeroCuentaOrigen) && autenticarCuentahabiente(numeroCuentaDestino)) {
            Cuenta cuentaOrigen = cuentahabientes.get(numeroCuentaOrigen);
            Cuenta cuentaDestino = cuentahabientes.get(numeroCuentaDestino);

            try {
                cuentaOrigen.retirar(monto);  // Intenta retirar el monto de la cuenta origen
                cuentaDestino.depositar(monto);  // Realiza el depósito en la cuenta destino
                System.out.println("Transferencia realizada correctamente.");
            } catch (SaldoCuentaInsuficiente e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Una de las cuentas no existe.");
        }
    }

    // Método para realizar retiro de efectivo
    public void retirarEfectivo(String numeroCuenta, int monto) {
        if (autenticarCuentahabiente(numeroCuenta)) {
            Cuenta cuenta = cuentahabientes.get(numeroCuenta);

            try {
                cuenta.retirar(monto);
                efectivoDisponible -= monto;
                System.out.println("Retiro realizado correctamente.");
            } catch (SaldoCuentaInsuficiente | SaldoEfectivoInsuficiente e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    // Clase interna para representar una cuenta
    private class Cuenta {
        private String numeroCuenta;
        private String titular;
        private int saldo;

        public Cuenta(String numeroCuenta, String titular, int saldo) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldo;
        }

        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public String getTitular() {
            return titular;
        }

        public int getSaldo() {
            return saldo;
        }

        public void depositar(int monto) {
            saldo += monto;
        }

        public void retirar(int monto) throws SaldoCuentaInsuficiente, SaldoEfectivoInsuficiente {
            if (monto > saldo) {
                throw new SaldoCuentaInsuficiente("Saldo insuficiente en la cuenta.");
            }
            if (monto > efectivoDisponible) {
                throw new SaldoEfectivoInsuficiente("Efectivo disponible en el cajero insuficiente.");
            }
            saldo -= monto;
        }
    }

    // Método principal para probar el cajero automático
    
}
