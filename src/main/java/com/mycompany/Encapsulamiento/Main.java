
package com.mycompany.Encapsulamiento;

/**
 *
 * @author Ezequiel Castro
 */
public class Main {

    public static void main(String[] args) {
        autocomun carro = new autocomun("Toyota");
        carroJuguete juguete = new carroJuguete("hotweels");
        System.out.println("carro comun ");
        carro.mostrarinfo();
        carro.acelerar(20);
        carro.acelerar();
        carro.frenar(10);
        carro.estacionar();
        carro.bocinar();
        
        
        
    }
    
}
