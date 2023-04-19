/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.subClases;

import clases.Persona;

public class Cliente extends Persona {
    // atributo adicional
    private String email;

    // constructor
    public Cliente(String nombre, String telefono, String direccion, String email) {
        super(nombre, telefono, direccion);
        this.email = email;
    }

    public Cliente(String nombre) {
        super(nombre, "", "");
        this.email = "";
    }
    
    // método getter y setter para el atributo adicional
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // método para mostrar los datos del cliente
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Email: " + email);
    }
}
