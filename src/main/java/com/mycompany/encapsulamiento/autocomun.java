/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamiento;

/**
 *
 * @author Ezequiel Castro
 */
public class autocomun extends automovil{

 public autocomun(String marca){
     super(marca);
 }
 
 public void acelerar(){
     System.out.println("el carro de jugute se mueve lento");
 }
 
 public void frenar(){
     System.out.println("el carro de jugeuete se detiene");
 }
    
 public void estacionar (){
     System.out.println("el automovil esta estacionado");
 }
 
 @Override
public void mostrarinfo(){
    System.out.println("Automovil" + marca + " ");
}

}
    