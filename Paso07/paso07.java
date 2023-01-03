package Paso07;

import Paso05.Tabla;

import java.util.Scanner;

/*
* Dado como datos las calificaciones de 20 alumnos de la materia de fundamentos de programación,
* realiza un programa en JAVA que obtenga lo siguiente:

-    Promedio general

-    Imprima las calificaciones en orden inverso
* */
public class paso07 {

    public static void main(String[] args) {

        int[] notas = {70, 80, 90, 100, 60, 50, 40, 30, 20, 10, 85, 95, 75, 65, 55, 45, 35, 25, 15, 5};

        Alumno alumno1 = new Alumno(notas);
        double promedio = alumno1.Promedio();
        System.out.println("El promedio general es: " + promedio);

        System.out.println("Imprima las calificaciones en orden inverso");
        alumno1.impInversas();
    }
}



