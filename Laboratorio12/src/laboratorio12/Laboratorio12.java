/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio12;

/**
 *
 * @author ENRIQUE
 */
public class Laboratorio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SaldoEfectivoInsuficiente {
        CajeroAutomatico cajero = new CajeroAutomatico();

        // Ejemplo de uso del cajero automático
        String numeroCuentaJuan = "123456";
        String numeroCuentaMaria = "789012";

        cajero.mostrarDatosCuenta(numeroCuentaJuan);
        cajero.mostrarDatosCuenta(numeroCuentaMaria);

        cajero.depositoEnEfectivo(numeroCuentaJuan, 20000);
        cajero.depositoEnOtraCuenta(numeroCuentaMaria, numeroCuentaJuan, 15000);

        cajero.retirarEfectivo(numeroCuentaJuan, 10000);
    }
    
}
