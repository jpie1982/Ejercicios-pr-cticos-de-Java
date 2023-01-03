package Paso11;

/*
 * Programa que pida el sueldo d N trabajadores e imprima el que tiene mayor sueldo
 */
public class Trabajador {
    private double sueldo;

  public Trabajador() {

    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double n) {
        this.sueldo = n;
    }

    @Override
    public String toString() {
        return " "+this.sueldo;
    }
}

