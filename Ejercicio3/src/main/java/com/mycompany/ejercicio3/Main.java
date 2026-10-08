/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author anamo
 */
public class Main {

    public static void main(String[] args) {
        Automovil auto1 = new
        Automovil("Ford",2018,3,Automovil.tipoCom.DIESEL,Automovil.tipoA.EJECUTIVO,5,6,250,Automovil.tipoColor.NEGRO,true);
        auto1.imprimir();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.acelerar(20); 
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desacelerar(50); 
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.frenar(); 
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desacelerar(20); 

        // Pruebas de los Ejercicios Propuestos 
        System.out.println("¿Es automático?: " + auto1.getAutomatico());

        // Aceleración permitida dentro del límite (0 + 150 = 150 <= 250)
        auto1.acelerar(150);
        System.out.println("Velocidad actual tras acelerar = " + auto1.getVelocidadActual());

        // Aceleración que sobrepasa el límite (150 + 120 = 270 > 250) -> Genera Multa
        auto1.acelerar(120);
        System.out.println("Velocidad actual tras intentar exceso = " + auto1.getVelocidadActual());
        System.out.println("¿Tiene multas?: " + auto1.tieneMultas());
        auto1.acelerar(120);
        System.out.println("Velocidad actual tras intentar exceso = " + auto1.getVelocidadActual());
        System.out.println("¿Tiene multas?: " + auto1.tieneMultas());
        System.out.println("Total multas acumuladas: $" + auto1.getMulta());
    }
}
