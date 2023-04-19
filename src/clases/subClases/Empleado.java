/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.subClases;

import clases.Persona;

public class Empleado extends Persona {
    // atributos adicionales
    private int codigoEmpleado;
    private String puesto;

    // constructor
    public Empleado(String nombre, String telefono, String direccion, int codigoEmpleado, String puesto) {
        super(nombre, telefono, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    // métodos getter y setter para los atributos adicionales
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // método para mostrar los datos del empleado
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Código de empleado: " + codigoEmpleado);
        System.out.println("Puesto: " + puesto);
    }
}