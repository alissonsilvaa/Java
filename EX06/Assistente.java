package EX06;
/*
a. crie a classe Assistente, que também é um funcionário, e que
possui um número de matrícula (faça os métodos GET e SET).
Sobrescreva o método exibeDados().
 */
public class Assistente extends Funcionario{
    private int numeroDeMatricula;

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", ganho anual=" + ganhoAnual() +
                "numeroDeMatricula=" + numeroDeMatricula +
                '}';
    }
}
