/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ventas extends Productos{
    private double ventas,acumulado;
    private String leer2;

    
    
    public void venta(Double venta){
    double cantidad;
    cantidad=getCantidad();
    if (cantidad >= venta){
    cantidad=cantidad-venta;
    setCantidad(cantidad);
    ventas=venta;
    }
    
    else{
    System.out.println("no existen suficientes productos");
    }
    
    }
    
    
    public void mostrarventas(){
    String nompro;
    //double valor;
    nompro=getNomproducto();
    System.out.println("Nombre del producto "+nompro);
    System.out.println("Nnumero de ventas "+ventas);
    //valor=getValor()*ventas;
    acumulado=getValor()*ventas;
    System.out.println("El valor total de la venta es "+acumulado);
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i=0,sel,m=0,reg=-1,vacio=0;
        String comp;
        double ven,dinero=0,acumtotal=0;
        Scanner leer=new Scanner(System.in);
      
        ArrayList<ventas> clvec = new ArrayList<>();

        
        while(i!=1){
  System.out.println("Ingrese la opcion a la que quiere acceder");
  System.out.println("1.Agregar producto");
  System.out.println("2.Buscar producto");
  System.out.println("3.Eliminar producto");
  System.out.println("4.Mostrar inventario");
  System.out.println("5.Realizar ventas");
  System.out.println("6.Mostrar ganancias totales");
  System.out.println("Salir");
  sel=leer.nextInt();
  
  switch(sel){
   
       case 1:
      ventas cl=new ventas();
      cl.almacenar();
      clvec.add(cl);
     
       break;
       
       
       case 2:
       System.out.println("Ingrese el nombre del producto");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
       if (comp.equals(clvec.get(n).getNomproducto())){
       reg=n;
       
       }
      }
      
       if (reg==-1){
       System.out.println("El producto buscado no existe");
       }
       
       else{
       clvec.get(reg).mostrar();
       reg=-1;
       }
        break;
        
        
       case 3:
         System.out.println("Ingrese el nombre del producto que desea borrar");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
       if (comp.equals(clvec.get(n).getNomproducto())){
       reg=n;
       
       }
      }
      
       if (reg==-1){
       System.out.println("El producto que busca no existe en esta base de datos");
       }
       
       else{
       clvec.remove(reg);
       System.out.println("El producto ha sido borrado");
       reg=-1;
       }
        break;   
        
       case 4:
           for(int n=0;n<clvec.size();n++){
           clvec.get(n).mostrar();
       }
        
       break;
       
       case 5:
         System.out.println("Ingrese el nombre del producto que desea vender");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
       if (comp.equals(clvec.get(n).getNomproducto())){
       reg=n;
       
       }
      }
      
       if (reg==-1){
       System.out.println("El producto que busca no existe en esta base de datos");
       }
       
       else{
       System.out.println("Ingrese la cantidad que desea vender");
       clvec.get(reg).venta(leer.nextDouble());
       System.out.println("Venta exitosa");
       reg=-1;
    }
       
       case 6:
        for (int n=0;n<clvec.size();n++){
        clvec.get(n).mostrarventas();
        dinero=dinero+clvec.get(n).acumulado;
        }
        
        if (acumtotal>dinero){
        dinero=acumtotal;
        }
        
        else{
        
        acumtotal=dinero;
                }
        System.out.println("La ganancia total es "+dinero);
        dinero=0;
       break;
    
}

}
}
}