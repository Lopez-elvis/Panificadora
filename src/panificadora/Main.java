/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panificadora;


import clases.Almacen;
import clases.subClases.Insumo;
import clases.subClases.Producto;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
    
        
        Insumo insumo1 = new Insumo("harina", 500, "kg", 900, 500, "emapa");
        Insumo insumo2 = new Insumo("harina", 500, "kg", 900, 500, "emapa");
        Insumo insumo3 = new Insumo("aceite", 20, "Litros", 150, 700, "girasol");

        
        
        LinkedList<Insumo> receta1 = new LinkedList<>();
        receta1.add(insumo1);
        receta1.add(insumo2);
        receta1.add(insumo3);
        Producto producto1 = new Producto("torta", 20, "unidades", 2000, 20, receta1);
        
        almacen.almacenarItem(insumo1);
        almacen.almacenarItem(insumo2);
        almacen.almacenarItem(insumo3);
        almacen.almacenarItem(producto1);
        
        System.out.println(almacen.getAlmacen());
    }
}
