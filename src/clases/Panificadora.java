
import java.util.LinkedList;

// token para acceder al proyecto mediante github
//      "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"
//PRE INTERFACE DE LA PANIFICADORA
// O LA CLASE MAIN
public class Panificadora
{
    public Producto getTortilla(int cant){
        
        Insumo i = new Insumo("harina",30*cant , "gr", 0.19*cant,750 ,"emapa");
        Insumo j = new Insumo("manteca",6*cant ,"gr", 0.01*cant,750 ,"gordito");
        Insumo k = new Insumo("azucar",8*cant ,"gr", 0.012*cant,750 ,"Belgica");
        Insumo l = new Insumo("sal",0.03*cant , "gr", 0.0005*cant, 800, "sal yodada");
        Insumo m = new Insumo("agua",20*cant , "ml",0.003*cant ,1000 , "semapa");
        
        LinkedList<Insumo> l1 = new LinkedList<>();
        l1.add(i);
        l1.add(j);
        l1.add(k);
        l1.add(l);
        l1.add(m);
       Producto p = new Producto("tortilla",1*cant,"unidad", 0.4*cant, 1 ,l1);
        System.out.println(p.getProducto());
        return p;
    }
    public Producto getMarraqueta(int cant){
        
        Insumo i = new Insumo("harina",30*cant , "gr", 0.19*cant,750 ,"emapa");
        Insumo j = new Insumo("manteca",3.8*cant ,"gr", 0.01*cant,750 ,"gordito");
        Insumo k = new Insumo("azucar",8.1*cant ,"gr", 0.012*cant,750 ,"Belgica");
        Insumo l = new Insumo("sal",0.032*cant , "gr", 0.0005*cant, 800, "sal yodada");
        Insumo m = new Insumo("agua",20*cant , "ml",0.003*cant ,1000 , "semapa");
        
        LinkedList<Insumo> l1 = new LinkedList<>();
        l1.add(i);
        l1.add(j);
        l1.add(k);
        l1.add(l);
        l1.add(m);
        Producto p = new Producto("marraqueta",1*cant,"unidad", 0.4*cant, 1 ,l1);
        System.out.println(p.getProducto());
        return p;
    }
    public Producto getArani(int cant){
        
        Insumo i = new Insumo("harina",30*cant , "gr", 0.19*cant,750 ,"emapa");
        Insumo j = new Insumo("manteca",6.1*cant ,"gr", 0.01*cant,750 ,"gordito");
        Insumo k = new Insumo("azucar",8.2*cant ,"gr", 0.012*cant,750 ,"Belgica");
        Insumo l = new Insumo("sal",0.032*cant , "gr", 0.0005*cant, 800, "sal yodada");
        Insumo m = new Insumo("agua",20*cant , "ml",0.003*cant ,1000 , "semapa");
        
        LinkedList<Insumo> l1 = new LinkedList<>();
        l1.add(i);
        l1.add(j);
        l1.add(k);
        l1.add(l);
        l1.add(m);
        Producto p = new Producto("marraqueta",1*cant,"unidad", 0.4*cant, 1 ,l1);
        System.out.println(p.getProducto());
        return p;
    }

   /* public marraqueta(){
        Insumo i = new Insumo("harina",0.003 , String unidad, double precio, int vencimiento, String proveedor);
        Insumo i = new Insumo("harina",0.003 , String unidad, double precio, int vencimiento, String proveedor);
        Insumo i = new Insumo("harina",0.003 , String unidad, double precio, int vencimiento, String proveedor);
        Insumo i = new Insumo("harina",0.003 , String unidad, double precio, int vencimiento, String proveedor);
    }*/
}
