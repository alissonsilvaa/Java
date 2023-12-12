package EX12;

public class Retangulo implements FiguraRetangulo {
    private double area;
    private double base;
    private double altura;
    private double espessura;
    private double volume;
    private double peso;
    private double pesoEspecifico;

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getEspessura() {
        return getArea() * getEspessura();
    }

    public double getVolume() {
        return getArea() * getBase() * getAltura();
    }

    public double getPeso() {
        return peso ;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPesoEspecifico() {
        return getArea() * getPeso() ;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "area=" + area +
                ", base=" + base +
                ", altura=" + altura +
                ", volume=" + volume +
                ", peso=" + peso +
                ", pesoEspecifico=" + pesoEspecifico +
                '}';
    }
}
