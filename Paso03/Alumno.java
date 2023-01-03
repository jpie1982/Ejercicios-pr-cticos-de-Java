package Paso03;

public class Alumno {
    int mat;
    float cal1, cal2, cal3, cal4, cal5, promedio;

    public Alumno(int mat, float cal1, float cal2, float cal3, float cal4, float cal5) {
        this.mat = mat;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
    }

    public int getMat() {

        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "mat=" + mat +
                ", cal1=" + cal1 +
                ", cal2=" + cal2 +
                ", cal3=" + cal3 +
                ", cal4=" + cal4 +
                ", cal5=" + cal5 +
                '}';
    }

    public float getPromedio() {
        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
        return promedio;
    }
}
