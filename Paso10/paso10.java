package Paso10;

import java.util.Scanner;

/*
* Progama que indique el total a pagar en una farmacia si el total apagar es:

 0 a 500 0% de descuento

 501 a 1000 5%

 1001 a 7000 11%

 7001 a 15000 18%

 150001 en adelante 25%
* */
public class paso10 {

    public static void main(String[] args) {
      Farmacia farmacia1 = new Farmacia();
Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el Monto a pagar");
        int total= lectura.nextInt();
        double totalAPagar = farmacia1.APagar(total);
        System.out.println("Total a pagar: " + totalAPagar);
    }
}
