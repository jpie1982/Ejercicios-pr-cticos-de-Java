package Paso08;

import Paso04.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Calcule el aumento de sueldo para un grupo de empleados de una empresa teniendo en cuenta el siguiente criterio:

Si el sueldo es inferior a $1,000.00    : Aumento 15%

Si el sueldo es mayor o igual a $1,000.00  : Aumento 12%

El programa debe hacer lo siguiente:

-        Guardar los nuevos sueldos en el arreglo

-        Calcular la nómina

-        Imprimir los sueldos desde el arreglo
*
* */
public class paso08 {
    public static void main(String[] args) {

        double nomina = 0;

        // lista de empleados y sueldos
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana",1000));
        empleados.add(new Empleado("Juan", 800));
        empleados.add(new Empleado("Pedro", 1000));
        empleados.add(new Empleado("Ana", 1200));
        empleados.add(new Empleado("Sandra", 900));
        empleados.add(new Empleado("Roberto", 1500));

        //aumento de sueldo para cada empleado
        for (Empleado x : empleados) {
            double aumento = x.Aumento();
            double sueldoNuevo = x.getSue() + aumento;
            x.setSue(sueldoNuevo);
            nomina += sueldoNuevo;
        }
        //nomina de sueldo para cada empleado
        for (Empleado x : empleados) {
            System.out.println(x.getNombre() + ": " + x.getSue());
        }
        System.out.println("Nómina total: " + nomina);
    }

}

