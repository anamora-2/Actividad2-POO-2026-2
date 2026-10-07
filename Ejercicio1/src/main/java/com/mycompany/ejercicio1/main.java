/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author anamo
 */
public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro","Pérez","1053121010","Colombia",'H',1998);
        Persona p2 = new Persona("Luis","León","1053223344","Colombia",'H',2001);
        Persona p3 = new Persona("Ana","Mesa","1084394374","Argentina",'M',2007);
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
    }
}
