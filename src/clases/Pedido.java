/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.subClases.Producto;
import java.time.LocalDate;
import java.util.LinkedList;

public class Pedido {
    private LinkedList<Producto> productos;
    private LocalDate fecha;
    private boolean hecho;
    
    public Pedido(LinkedList<Producto> productos) {
        this.productos = productos;
        this.hecho = false;
        this.fecha = LocalDate.now();
    }
    
    // Getter y setter para items
    public LinkedList<Producto> getProductos() {
        return productos;
    }
    
    public void setItems(LinkedList<Producto> nuevos) {
        this.productos = nuevos;
    }
    
    // Getter y setter para fecha
    public LocalDate getFecha() {
        return this.fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
     public boolean isEstaHecho() {
        return this.hecho;
    }

    public void isHecho(boolean estaHecho) {
        this.hecho = estaHecho;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }
    
    public String getPedido(){
        String info = "Pedido del " + fecha + ":\n";
        for (Producto p : productos) {
            info += p.getItem() + "\n";
        }
        info += "Total: " + getTotal();
        return info;
    }
}

