package Paso01;

public class ProcesadorNumeros {

    private int sumaImpares = 0;
    private double promedioPares = 0;
    private int cantidadPares = 0;

    // Método para procesar un número dado
    public void procesarNumero(int num) {

        if (num % 2 == 0) {
            promedioPares += num;
            cantidadPares++;
        }

        else {
            sumaImpares += num;
        }
    }

    // Método para  la suma de números impares dados
    public int SumaImparesDados() {
        return sumaImpares;
    }

    // Método para promedio de números pares dados
    public double PromedioParesDados() {
        if (cantidadPares > 0) {
            return promedioPares / cantidadPares;
        }
        else {
            return 0;
        }
    }
}

