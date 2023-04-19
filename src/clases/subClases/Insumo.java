/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.subClases;

import clases.Item;

public class Insumo extends Item {
    private String proveedor;
    
    public Insumo(String nombre, double cantidad, String unidad, double precio, int vencimiento, String proveedor) {
        super(nombre, cantidad, unidad, precio, vencimiento);
        this.proveedor = proveedor;
    }
    
    // Getter y setter para proveedor
    public String getProveedor() {
        return proveedor;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String getInsumo() {
        return super.getItem() + "\nProveedor: " + proveedor;
    }
    
    public boolean restarInsumo(Item producto){
        boolean is = false;
        if(this.cantidad >= producto.getCantidad()){
            is = true;
            this.cantidad = cantidad - producto.getCantidad();
        }
        return is;
    }
}
