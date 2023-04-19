/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.subClases;

import clases.Item;
import java.util.LinkedList;

public class Producto extends Item {
    private LinkedList<Insumo> insumos;
    
    public Producto(String nombre, double cantidad, String unidad, double precio, int vencimiento, LinkedList<Insumo> insumos) {
        super(nombre, cantidad, unidad, precio, vencimiento);
        this.insumos = insumos;
    }
    
    // Getter y setter para insumos
    public LinkedList<Insumo> getInsumos() {
        return insumos;
    }
    
    public void setInsumos(LinkedList<Insumo> insumos) {
        this.insumos = insumos;
    }
    
    public double getCostoProduccion() {
        double costo = 0.0;
        for (Insumo insumo : insumos) {
            costo += insumo.getPrecio();
        }
        return costo;
    }
    //disminuye la cantidad de item
    public void disminuirItem(Item item) {
         this.cantidad -= item.getCantidad();
        }
        
    public String getProducto(){
        String info = super.getItem() + "\nCosto de Produccion: " + getCostoProduccion() +"\n \nInsumos del producto";
        for (Insumo insumo : insumos) {
            info += "\n" + insumo.getItem();
        }
        
        return info;
    }
     
}