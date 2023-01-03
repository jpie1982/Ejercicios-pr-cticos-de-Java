package Paso08;
/*
* Calcule el aumento de sueldo para un grupo de empleados de una empresa teniendo en cuenta el siguiente criterio:

Si el sueldo es inferior a $1,000.00    : Aumento 15%

Si el sueldo es mayor o igual a $1,000.00  : Aumento 12%

El programa debe hacer lo siguiente:

-        Guardar los nuevos sueldos en el arreglo

-        Calcular la nómina

-        Imprimir los sueldos desde el arreglo
*
* */
public class Empleado {

    private  String nombre; // nombre
    private double sue; // sueldo
    private final double por1 = 0.15; // 15%
    private final double por2 = 0.12; // 12%

    public Empleado(String nombre, double sue) {
        this.nombre = nombre;
        this.sue = sue;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSue() {
        return sue;
    }

    public void setSue(double sue) {
        this.sue = sue;
    }
    public double Aumento(){
        if (sue < 1000){

            return (sue * por1);
        }
        else {

            return (sue * por2);
        }
    }
}
