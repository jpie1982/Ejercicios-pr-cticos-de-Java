package Paso13;

public class Potencia {

    public double elevar(double numero, int potencia) {
        double resultado = 1;
        for (int i = 0; i < potencia; i++) {

            resultado = resultado * numero;

        }
        return resultado;
    }
}
