
package com.mycompany.encapsulamiento;

/**
 *
 * @author Ezequiel Castro
 */
public class carroJuguete extends automovil{
 
     public carroJuguete(String marca){
     super(marca);
 }
 
 public void acelerar(){
     System.out.println("el carro de jugute se mueve lento");
 }
 
 public void frenar(){
     System.out.println("el carro de jugeuete se detiene");
 }
    
 public void estacionar (){
     System.out.println("el carro de juguete esta estacionado");
 }
}
