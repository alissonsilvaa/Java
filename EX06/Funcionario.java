package EX06;
/*
Implemente a classe Funcionario com nome, salario e os métodos
addAumento(double valor), ganhoAnual() e exibeDados() - imprime
os valores do funcionário.
a. crie a classe Assistente, que também é um funcionário, e que
possui um número de matrícula (faça os métodos GET e SET).
Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e
que os Assistentes Administrativos possuem um turno (dia ou noite) e
um adicional noturno, crie as classes Tecnico e Administrativo e
sobrescreva o método ganhoAnual() de ambas as classes
(Administrativo e Tecnico).
Crie um assistente administrativo e um técnico. Imprima o número de
matrícula e o nome de cada um deles.
 */

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>0) {
            this.salario = salario;
        }
    }

    public void addAumento(double aumento){
        if (aumento>0){
            setSalario(getSalario()+aumento);
        }
    }

    public double ganhoAnual(){
        return getSalario() * 12;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ganho anual=" + ganhoAnual() +
                '}';
    }
}
