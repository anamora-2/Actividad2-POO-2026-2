/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author anamo
 */
public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;
    int ladoLateral1;
    int ladoLateral2;
    
    public Trapecio(int baseMayor, int baseMenor, int altura, int ladoLateral1,
            int ladoLateral2){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoLateral1 = ladoLateral1;
        this.ladoLateral2 = ladoLateral2;
    }
    
    double calcularArea(){
        return ((baseMayor+baseMenor)*altura/2);
    }
    
    double calcularPerimetro(){
        return(baseMayor + baseMenor + ladoLateral1 + ladoLateral2);    
    }
}
