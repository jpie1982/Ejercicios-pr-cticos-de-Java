package Paso09;

import java.util.ArrayList;

public class Myn {
/*
    int a,b;

    public boolean mayorQue(int a, int b){
        return a > b;
    }
    public boolean menorQue(int a, int b){
        return a < b;
    }*/

    public int Mayor(int [] Listanumeros) {
        int mayor = Integer.MIN_VALUE;
        for (int x : Listanumeros) {
            if (x > mayor) {
                mayor = x;
            }
        }
        return mayor;
    }

    public int Menor(int [] Listanumeros) {
        int menor = Integer.MAX_VALUE;
        for (int x : Listanumeros) {
            if (x < menor) {
                menor = x;
            }
        }
        return menor;
    }
}
