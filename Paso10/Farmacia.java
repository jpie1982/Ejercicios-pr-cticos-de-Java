package Paso10;
/*
* Progama que indique el total a pagar en una farmacia si el total apagar es:

 0 a 500 0% de descuento

 501 a 1000 5%

 1001 a 7000 11%

 7001 a 15000 18%

 150001 en adelante 25%
* */
public class Farmacia {
    int pago;
    double dto1 = 0.95;
    double dto2 = 0.89;
    double dto3 = 0.82;
    double dto4 = 0.75;
    double apagar;

    public double APagar(double total) {
        if (total >= 0 && total <= 500) {
            System.out.println("0% Descuento");
            return total;
        } else if (total > 500 && total <= 1000) {
            System.out.println("5% Descuento");
            return total * dto1;
        } else if (total > 1000 && total <= 7000) {
            System.out.println("11% Descuento");
            return total * dto2;
        } else if (total > 7000 && total <= 15000) {
            System.out.println("18% Descuento");
            return total * dto3;
        } else {
            System.out.println("25% Descuento");
            return total * dto4;
        }
    }
}




