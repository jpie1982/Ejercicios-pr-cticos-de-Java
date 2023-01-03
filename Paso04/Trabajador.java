package Paso04;

public class Trabajador {
    double sue;
     double por1 = 0.15;
     double por2 = 0.10;
    public Trabajador(float sueldo) {
        this.sue = sueldo;
    }

    public float getSue() {

        if (sue < 1000){
            System.out.println("Sueldo menor que $1000 corresponde %15 mas");
            sue = (sue * por1)+ sue;
        }
        else {
            System.out.println("Sueldo mayor que $1000 corresponde %10 mas");
            sue = (sue * por2) + sue;
        }
        return (float) sue;
    }

    public void setSue(float sue) {
        this.sue = sue;

    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "sueldo=" + sue +
                '}';
    }
}
