/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author anamo
 */
public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    String paisNacimiento;
    char genero;
    int añoNacimiento;
    
    
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,
        String paisNacimiento, char genero, int añoNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
        this.añoNacimiento = añoNacimiento;
    }
    void imprimir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + 
           numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }
    
}
