package EX08;
/*
Classe Pobre que também herda de Pessoa:
• Atributos adicionais:
• horasTrabalhadas do tipo int
• valorPorHora do tipo double
• Métodos adicionais:
• calcularSalario(): multiplica as horas trabalhadas
pelo valor por hora.
• aumentarValorPorHora(double incremento):
aumenta o valor por hora.
 */
public class Pobre extends Pessoa {
    private int horasTrabalhadas;
    private double valorPorHora;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
    public void aumentarValorPorHora(double incremento){
        valorPorHora += incremento;
    }

    public String trabalha(){
        return "EU SOU "+getNome() +
                " TENHO 32 ANOS "+getIdade()
                + " NÃO TENHO DINHERIO! ";
    }

}
