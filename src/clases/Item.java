/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;

public abstract class Item
{
    protected String nombre;
    protected double cantidad;
    protected String unidad;
    protected double precio;
    protected LocalDate ingreso;
    protected LocalDate vencimiento;

    public Item(String nombre, double cantidad, String unidad, double precio, int diasParaVencer) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.precio = precio;
        this.ingreso = LocalDate.now();
        this.vencimiento = ingreso.plusDays(diasParaVencer);
    }
    
    public void disminuirItem(Item nuevo){
        // va restar la cantidad y precio a mi objeto this con nuevo;
        //
    }
    
    public void aumentarItem(Item nuevo){
        // aumentar la ,,           ,,    a mi objeto this 
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public double getCantidad() {
        return cantidad;
    }
    public String getUnidad() {
        return unidad;
    }
    public double getPrecio() {
        return precio;
    }
    public LocalDate getVencimiento() {
        return vencimiento;
    }
    public LocalDate getIngreso() {
        return ingreso;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }   
    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }
    
    public boolean isEquals(Item nuevo){
        boolean bandera = false;
        if(this.nombre.equals(nuevo.getNombre())){
            bandera = true;
        }
        return bandera;
    }
    
    public String getItem() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n").append("Nombre: ").append(nombre).append("\n");
    sb.append("Precio: ").append(precio).append("\n");
    sb.append("Cantidad: ").append(cantidad).append(" ").append(unidad).append("\n");
    sb.append("Fecha de ingreso: ").append(ingreso).append("\n");
    sb.append("Fecha de vencimiento: ").append(vencimiento);
    return sb.toString();
}
}

