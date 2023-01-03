package Paso14;
/*
* Programa para elevar un numero a n potencia usando while.
* */
public class Potenciawhile {
    public double elevar(double numero, int potencia) {
        double resultado = 1;
        double contador = 0;

        while (contador < potencia){

            resultado = resultado * numero;

            contador++;

        }

        return resultado;
    }
}
