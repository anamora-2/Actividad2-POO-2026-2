/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author anamo
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        Rombo figura4 = new Rombo(8,6,5);
        Trapecio figura5 = new Trapecio(10,4,4,5,5);
        TrianguloRectangulo figura6 = new TrianguloRectangulo(3,5);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura6.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura6.calcularPerimetro());
        figura6.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El área del rombo es = " + figura4.calcularArea());
        System.out.println("El perímetro del rombo es = " + figura4.calcularPerimetro());
        System.out.println();
        System.out.println("El área del trapecio es = " + figura5.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura5.calcularPerimetro());
    }
}
