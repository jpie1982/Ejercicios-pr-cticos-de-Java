package Paso07;

import java.util.ArrayList;

public class Alumno {
    private final int[] notas;

    public Alumno(int[] notas) {
        this.notas = notas;
    }
    public double Promedio() {
        int suma = 0;
        for (int i = 0; i < notas.length; i++){
        int calificacion = notas[i];
            suma += calificacion;
        }
        return suma / notas.length;
    }
    public void impInversas() {
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }
    }
}






