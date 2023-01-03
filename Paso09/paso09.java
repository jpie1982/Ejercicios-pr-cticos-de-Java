package Paso09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
* PROGRAMA QUE CALCULE EL MAYOR Y MENOR DE N NUMEROS
* */
public class paso09 {
        int num1;

    public static void main(String[] args) {

        Myn numeros = new Myn();
        Random rnd = new Random();
        //ArrayList<Integer> Listanumeros = new ArrayList<>();
        int [] Listanumero = new int[5];
        for (int i = 0; i < Listanumero.length ; i++) {
            Listanumero[i] = rnd.nextInt(100);

        }
        for (int i = 0; i < Listanumero.length ; i++) {
            System.out.println(Listanumero[i]+" Puesto "+i);

        }

        System.out.println("El numero mayor del array es: "+numeros.Mayor(Listanumero));
        System.out.println("El numero menor del array es: "+numeros.Menor(Listanumero));



    }
}
