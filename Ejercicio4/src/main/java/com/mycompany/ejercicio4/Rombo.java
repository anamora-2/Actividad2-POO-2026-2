/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author anamo
 */
public class Rombo {
    int diagonalMayor;
    int diagonalMenor;
    int lado;
    
    public Rombo(int diagonalMayor, int diagonalMenor, int lado){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    
    double calcularArea(){
        return(diagonalMayor*diagonalMenor/2);
    }
    
    double calcularPerimetro(){
        return(4*lado);
    }
    
}
