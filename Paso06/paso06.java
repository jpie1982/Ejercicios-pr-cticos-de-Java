package Paso06;

import Paso05.Tabla;

import java.util.Scanner;

/*
* PROGRAMA QUE REALIZA LA TABLA DE MULTIPLICAR DE CUALQUIER DIGITO
* */
public class paso06 {
    public static void main(String[] args) {
        //Variables
        int numero;

        Tabla tablas = new Tabla();

        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese un numero para generar la tabla");
        numero = lectura.nextInt();
        Tabla.imprimirTabla(numero);

    }

}