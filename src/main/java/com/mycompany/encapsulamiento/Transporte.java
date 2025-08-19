
package com.mycompany.encapsulamiento;

/**
 *
 * @author Ezequiel Castro
 */
public abstract class Transporte{
    protected String marca;
    protected int velocidad;
    
    public Transporte(String marca){
        this.marca = marca;
        this.velocidad = 130 ;
    }
    
    // metodo con implementacion para mostrar info
     void mostrarinfo (){
        System.out.println("marca :" + marca +"|velocidad: " + velocidad );
    }
        //metodos abstractos para que las subclases lo implementen
    abstract void aceledrar(int incremento);
    abstract void frenar (int decremento);
    // implementacion de de los metodos de la interfaz acciones
    public void estacionar(){
        velocidad = 0;
        System.out.println("el automovil esta estacionado ");              
    }
    public void bocinar(){
        System.out.println("piiiiiiii!!!");
    }
    
   
    
}
