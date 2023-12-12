package EX11;

public class Circulo implements FiguraGeometrica {
    private double raio;
    private double PI = 3.14;
    private double altura;
    private double pesoEspecifico;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPerimetro() {
        return getPI() * 2 * getRaio();
    }


    public double getArea() {
        return getRaio() * getRaio() * getPI();
    }


    public double getVolume() {
        return getArea() * getAltura();
    }

    public double getPeso() {
        return getVolume() * getPesoEspecifico() ;
    }


    public double getPI() {
        return PI;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoEspecifico() {
        return pesoEspecifico;
    }

    public void setPesoEspecifico(double pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + getRaio() +
                ", perimetro=" + getPerimetro() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                ", peso=" + getPeso() +
                ", PI=" + getPI() +
                '}';
    }

}
