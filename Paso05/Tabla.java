package Paso05;

public class Tabla {

    public static void imprimirTabla(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = "+resultado);
        }
       System.out.println();
    }
}
