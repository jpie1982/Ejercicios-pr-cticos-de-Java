package Paso03;

import java.util.Scanner;

/*Realiza el programa en JAVA tal que dado como datos la matrícula y 5 calificaciones de un alumno;
imprima la matrícula, el promedio y la palabra “aprobado” si el alumno tiene un promedio mayor o igual que 6,
y la palabra “no aprobado” en caso contrario.

Datos: MAT, CAL1, CAL2, CAL3, CAL4, CAL5

Donde: MAT es una variable entera que representa la matrícula del alumno.

CAL1, CAL2, CAL3, CAL4 y CAL5 son variables de tipo real que representan las 5 calificaciones del alumno
*
* */
public class Paso03 {
    public static void main(String[] args) {
        int mat;
        float cal1, cal2, cal3, cal4, cal5;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite numero matricula");
        mat = lectura.nextInt();
        System.out.print("Ingresa la calificación 1: ");
        cal1 = lectura.nextFloat();
        System.out.print("Ingresa la calificación 2: ");
        cal2 = lectura.nextFloat();
        System.out.print("Ingresa la calificación 3: ");
        cal3 = lectura.nextFloat();
        System.out.print("Ingresa la calificación 4: ");
        cal4 = lectura.nextFloat();
        System.out.print("Ingresa la calificación 5: ");
        cal5 = lectura.nextFloat();
        Alumno alumno1 = new Alumno(mat,cal1,cal2,cal3,cal4,cal5);

        System.out.println("La matricula del alumno es: "+alumno1.getMat());
        System.out.println("El promedio es: "+alumno1.getPromedio());
        if (alumno1.getPromedio() >= 6){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobado");
        }

    }
}
