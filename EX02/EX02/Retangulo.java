package EX02;


public class Retangulo {
    private double ladoA;
    private double ladoB;
    private double altura;
    private String cor;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return getLadoA() * getLadoB();
    }


    public double getPerimetro() {
        return 2 * getLadoA() + 2 * getLadoB();
    }


    public double getVolume() {
        return getArea()*getAltura();
    }

}