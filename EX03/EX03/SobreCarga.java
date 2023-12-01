package EX03;

public class SobreCarga {
    private double raio;
    private double PI = 3.14;

    public SobreCarga() {

    }

    public SobreCarga(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double calcularAreaCirculo() {
        double area = getRaio() * getRaio() * getPI();
        return area;
    }

    public double calcularAreaCirculo(double numero) {
        double area = numero * numero * getPI();
        return area;
    }

    public double calcularAreaCirculo(double numero, String mensagem) {
        double area = numero * numero * getPI();
        System.out.println(mensagem);
        return area;
    }

    public double calcularAreaCirculo(String a, double numero) {
        double area = numero * numero * getPI();
        return area;
    }
}