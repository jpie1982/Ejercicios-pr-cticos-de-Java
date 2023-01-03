package Paso13;

import java.util.Scanner;

/*
* Programa que eleve un numero a n potencia usando for.
* */
public class paso13 {
    public static void main(String[] args) {
        System.out.print("Ejercicio 13 \n");
        Scanner teclado=new Scanner(System.in);
        int num,ele;
        System.out.print("numero a elevar: ");
        num=teclado.nextInt();
        System.out.print("elevar a la: ");
        ele=teclado.nextInt();
        Potencia potencia1 = new Potencia();
        double resultado = potencia1.elevar(num, ele);
        System.out.println("El resultado es: "+resultado);

    }
}


