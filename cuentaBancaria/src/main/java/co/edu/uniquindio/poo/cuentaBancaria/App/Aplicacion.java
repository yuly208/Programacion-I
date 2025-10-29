package co.edu.uniquindio.poo.cuentaBancaria.App;

import javax.swing.*;
import co.edu.uniquindio.poo.cuentaBancaria.Model.CuentaAhorros;
import co.edu.uniquindio.poo.cuentaBancaria.Model.CuentaCorriente;

public class Aplicacion {

    public static void main(String[] args) {
        
        // Crear Cuenta de Ahorros
        float saldoAhorros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial de la Cuenta de Ahorros:"));
        float tasaAhorros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tasa anual (%) de la Cuenta de Ahorros:"));
        CuentaAhorros cuentaAhorros = new CuentaAhorros(true, saldoAhorros, 0, 0, tasaAhorros, 0);

        // Crear Cuenta Corriente 
        float saldoCorriente = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial de la Cuenta Corriente:"));
        float tasaCorriente = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tasa anual (%) de la Cuenta Corriente:"));
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoCorriente, 0, 0, tasaCorriente, 0, 0, true);

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "1. Consignar en Cuenta de Ahorros\n"
                    + "2. Retirar de Cuenta de Ahorros\n"
                    + "3. Mostrar Cuenta de Ahorros\n"
                    + "4. Consignar en Cuenta Corriente\n"
                    + "5. Retirar de Cuenta Corriente\n"
                    + "6. Mostrar Cuenta Corriente\n"
                    + "7. Salir"));

            switch (opcion) {
                case 1:
                    cuentaAhorros.consignarDinero();
                    break;
                case 2:
                    cuentaAhorros.retirarDinero();
                    break;
                case 3:
                    cuentaAhorros.toString();
                    break;
                case 4:
                    cuentaCorriente.consignarDinero();
                    break;
                case 5:
                    cuentaCorriente.retirarDinero();
                    break;
                case 6:
                    cuentaCorriente.toString();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        } while (opcion != 7);

    }
}
