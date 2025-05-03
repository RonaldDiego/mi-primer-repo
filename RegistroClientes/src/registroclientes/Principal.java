/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroclientes;

/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String[] args) {
        VCliente ventana = new VCliente();

        // Caso válido
        ventana.registrarCliente("abc123", "Juan");

        // Caso con código inválido
        ventana.registrarCliente("!@#$$%", "Pedro");

        // Uso de sobrecarga (solo código)
        ventana.registrarCliente("cliente001");

        ventana.mostrarClientes();
    }
}

