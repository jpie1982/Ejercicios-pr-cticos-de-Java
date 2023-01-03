package Paso02;
/* Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:

2, 5, 7, 10, 12, 15, 17, . . ., 1800
*/
public class paso02 {
    public static void main(String[] args) {
        // Declaración de variables
        int suma = 0;
        int ultimoTermino = 0;
        int valorfinal = 1800;
        valores serie = new valores();
        int i = 1;

        // Iteramos desde el primer término de la serie (2) hasta el último (1800)
        while (i <= 1800) {
            if (serie.pares(i)) {
                ultimoTermino = ultimoTermino + 3;
                System.out.println(ultimoTermino);
            } else if (serie.inpares(i)) {
                ultimoTermino = ultimoTermino + 2;
                System.out.println(ultimoTermino);
            }
            i++;
        }


    }
}