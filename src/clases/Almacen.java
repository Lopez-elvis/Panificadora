/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.subClases.Cliente;
import clases.subClases.Empleado;
import clases.subClases.Insumo;
import clases.subClases.Producto;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Almacen {
    private List<Insumo> insumos;
    private List<Producto> productos;
    private Queue<Pedido> colaPedidos;
    private List<Empleado> empleados;
    private List<Cliente> clientes;
    private Persona gefe;
    
 
    public Almacen() {
        this.insumos = new LinkedList<>();
        this.productos = new LinkedList<>();
        this.colaPedidos = new LinkedList<>();

    }

    //Pedidos
    public void agregarPedido(Pedido pedido) {
        colaPedidos.offer(pedido); // Agrega el pedido al final de la cola
    }
    
    
    
    private void procesarPedido(Pedido pedido){
        colaPedidos.remove();
        
         
        //recorremos todos los productos de la lista de pedido y preguntamos si  
        //hay en despensa
            //si: preocesarProducto(indice, pedido.getProducto)
            //no: producir()
            //pedido.setHecho = true;
            /*
            */  
    }
    
    private void procesarProducto(Producto p){
        
        for (Producto i: productos){
            if(i.isEquals((Producto)p)){
                    i.disminuirItem(i);
                }
        }
        
        /*
           // modifica el estado del almacen en base al producto P reduciendo los productos
           // recorrer la lista de productos DE ALMACEN
           // vas buscando el producto p en productos
           // modificando los valores de cantidad y precio en productos en base a p
           //    i.disminuirItem(Item nuevo)   
       }
           
           
           
           */
       
    }
    
   
   // }
    
    private void producir(Producto p){
        
        
        for (Insumo i: p.getInsumos()){
            for(Insumo j : this.insumos){
                if(j.isEquals((Insumo)i)){
                    j.disminuirItem(i);
                }
                                
            }
        
        }
        almacenarItem(p);
        
        // modifica el estado del almacen en base a los insumos del producto
        // recorriendo toda la lista de insumos del producto 
        // cada insumo tendrias que ir restando los insumos iguales insumos
        // isEquals preguntas si son iguales  
        // i.disminuirItem(p.getinsumos())
        // almacenaItem(p)
    }
    
    
    public void almacenarItem(Item nuevo) {
        boolean encontrado = false;
        if (nuevo instanceof Insumo){
            for(Insumo i : insumos){
                if (i.getNombre().equals(nuevo.getNombre())){
                    i.setCantidad(i.getCantidad() + nuevo.getCantidad());
                    i.setPrecio(i.getPrecio() + nuevo.getPrecio());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                insumos.add((Insumo)nuevo);
            }
        }else{
            if(nuevo instanceof Producto){
                for (Producto p : productos) {
                    if (p.getNombre().equals(nuevo.getNombre())) {
                        p.setCantidad(p.getCantidad() + nuevo.getCantidad());
                        p.setPrecio(p.getPrecio() + nuevo.getPrecio());
                        encontrado = true;
                    }
                }
                if (!encontrado){
                    productos.add((Producto)nuevo);
                }
            }
        }
    }
    
    public List<Insumo> getInsumos() {
        return this.insumos;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public String getAlmacen(){
        StringBuilder sb = new StringBuilder();
        sb.append("Inventario de Insumos:\n");
        for (Insumo insumo : insumos) {
            sb.append(insumo.getInsumo()).append("\n");
        }
        sb.append("\nInventario de Productos:\n");
        for (Producto producto : productos) {
            sb.append(producto.getProducto()).append("\n");
        }
        return sb.toString();
    }
}

