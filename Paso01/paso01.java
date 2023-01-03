package Paso01;

import java.util.Scanner;
/*Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado),

    obtenga la suma de los números impares y el promedio de los números pares.

    Datos: NUM1, NUM2, . . ., NUM270

    Donde: NUMi es una variable de tipo entero que representa el número entero i que se ingresa (1 ≤ i ≤ 270).*/
public class paso01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ProcesadorNumeros procesador = new ProcesadorNumeros();


        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número entero: ");
            int num = sc.nextInt();
            procesador.procesarNumero(num);
        }


        System.out.println("Suma de números impares: " + procesador.SumaImparesDados());
        System.out.println("Promedio de números pares: " + procesador.PromedioParesDados());
    }
}
/*
class ProcesadorNumeros {

    private int sumaImpares = 0;
    private double promedioPares = 0;
    private int cantidadPares = 0;

    // Método para procesar un número dado
    public void procesarNumero(int num) {

        if (num % 2 == 0) {
            promedioPares += num;
            cantidadPares++;
        }

        else {
            sumaImpares += num;
        }
    }

    // Método para  la suma de números impares dados
    public int SumaImparesDados() {
        return sumaImpares;
    }

    // Método para promedio de números pares dados
    public double PromedioParesDados() {
        if (cantidadPares > 0) {
            return promedioPares / cantidadPares;
        }
        else {
            return 0;
        }
    }
}*/
