
package com.mycompany.encapsulamiento;

/**
 *
 * @author Ezequiel Castro
 */
public class automovil extends Transporte implements acciones{
    
    public automovil(String marca){
        super(marca);
    }
    
    // implementacion de los metodos abstractos de transporte
    @Override
public void acelerar(int incremento){
    velocidad += incremento;
        System.out.println("el automovil acelera a: " +velocidad );
}    
    @Override
public void frenar(int decremento){
     velocidad -= decremento ;
        if (velocidad < 0) velocidad = 0 ;
        System.out.println("el automovil freno a : "+ velocidad +" Km/H");
        
    }

            
}    

