package Paso04;

import java.util.Scanner;

/*
* Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador,
* le aplique un aumento del 15% si su sueldo es inferior a $1000 y 12% en caso contrario.
* Imprima el nuevo sueldo del trabajador.

Dato: SUE (variable de tipo real que representa el sueldo del trabajador).
*
* */
public class paso04 {
    public static void main(String[] args) {
        int sueldo;
        Scanner lectura= new Scanner(System.in);
        System.out.print("Ingresa el sueldo del trabajador: $");
        sueldo = lectura.nextInt();
        Trabajador  trabajador1 = new Trabajador(sueldo);
        System.out.println("El sueldo del trabajador con aumento es: "+trabajador1.getSue());
    }
}
