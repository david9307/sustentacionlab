/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Productos {
    private String nomproducto;
    private double cantidad;        
    private double valor;
    private Scanner leer;

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    
    
    public void almacenar(){
    leer=new Scanner(System.in);    
    System.out.println("Ingrese el nombre del producto");
    nomproducto=leer.next();
    System.out.println("Ingrese la cantidad de productos");
    cantidad=leer.nextInt();
     System.out.println("Ingrese el valor del precio individual");
    valor=leer.nextDouble();
    
    
    }
    
    
    public void mostrar(){
    System.out.println("Nombre del producto "+nomproducto);
    System.out.println("cantidad existente "+cantidad);
    System.out.println("precio "+valor);
    
    
    }
    
    
    /**
     * @param args the command line arguments
     */
   
    
}
