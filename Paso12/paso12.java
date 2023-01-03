package Paso12;

import java.util.Scanner;

/*
* Programa que pide el precio de 5 boletos y muestra cuantos se vendieron de cada uno y el precio de la compra.
*/
public class paso12 {

    public static void main(String[] args) {
        Boleteria boleteria = new Boleteria();
        boleteria.venderBoletos();
    }
}

    class Boleteria {
        public void venderBoletos() {
            Scanner scanner = new Scanner(System.in);

            int cantidadBoletos = 5;
            double precioTotal = 0;
            for (int i = 0; i < cantidadBoletos; i++) {
                System.out.print("Ingrese el precio del boleto " + (i+1) + ": ");
                double precio = scanner.nextDouble();
                precioTotal += precio;
            }

            System.out.println("Cantidad de boletos vendidos: " + cantidadBoletos);
            System.out.println("Precio total de la compra: " + precioTotal);
        }
    }





