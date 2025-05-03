/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroclientes;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */

public class VCliente {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    // Sobrecarga 1 - código y nombre
    public void registrarCliente(String codigo, String nombre) {
        try {
            if (!codigoValido(codigo)) {
                throw new IllegalArgumentException("No se puede guardar cliente con código inválido.");
            }

            Cliente nuevo = new Cliente(codigo, nombre);
            listaClientes.add(nuevo);
            System.out.println("Cliente registrado correctamente: " + nuevo);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Sobrecarga 2 - solo código (nombre por defecto)
    public void registrarCliente(String codigo) {
        registrarCliente(codigo, "SinNombre");
    }

    private boolean codigoValido(String codigo) {
        return codigo.matches("[a-zA-Z0-9]+"); // solo letras y números
    }

    public void mostrarClientes() {
        System.out.println("Lista de clientes registrados:");
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }
    }
}

