package EX06;
/*
a. crie a classe Assistente, que também é um funcionário, e que
possui um número de matrícula (faça os métodos GET e SET).
Sobrescreva o método exibeDados().
 */
public class Assistente extends Funcionario {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   @Override
    public String toString() {
        return "Assistente{" +
                "matricula=" + matricula +
                "} " + super.toString();
   }
}
