package Paso11;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* Programa que pida el sueldo d N trabajadores e imprima el que tiene mayor sueldo
 */
public class paso11 {
    public static void main(String[] args) {
        double mayorsueldo = 0 ;
        double posicion = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Cuantos trabajadores son: ");

        int cantidad = lectura.nextInt();
        Trabajador Listatrabajador[] = new Trabajador[cantidad];

        for (int i = 0; i < cantidad; i++){
            Trabajador trabajador1 = new Trabajador();
            System.out.println("El sueldo del trabajador "+(i+1)+" es: ");
            double sueldo = lectura.nextDouble();

            trabajador1.setSueldo(sueldo);

            if (trabajador1.getSueldo() > mayorsueldo){
                mayorsueldo = trabajador1.getSueldo();
                posicion = i;
            }
            Listatrabajador[i] = trabajador1;
        }

        System.out.println("Trabajador con mayor sueldo: " +Listatrabajador[(int) posicion]);
    }
}
