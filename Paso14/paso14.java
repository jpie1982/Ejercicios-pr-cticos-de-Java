package Paso14;

/*
* Programa para elevar un numero a n potencia usando while.
* */

import java.util.Scanner;

public class paso14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ejercicio 14 \n");
        System.out.print("numero a elevar: ");
        int num=teclado.nextInt();
        System.out.print("elevar a la: ");
        int ele=teclado.nextInt();
        Potenciawhile potencia1 = new Potenciawhile();
        double resultado = potencia1.elevar(num, ele);
        System.out.println("El resultado es: "+resultado);

    }
}
