/*A empresa que você trabalha descobriu que você está indo muito bem
neste curso de Java e pediu para que você desenvolvesse um
programa que calcula os pagamentos para os prestadores de serviços
da empresa.
Este programa deve receber as seguintes entradas de dados do
usuário:
• Nome (texto)
• Valor por hora (decimal)
• Horas trabalhadas (inteiro)
• Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento,
mostrando os cálculos e os resultados finais, como no exemplo abaixo:
Folha de pagamento: Pedro Silva
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52
Use a formatação de saída com println para imprimir na saída e o
tipo Scanner para receber a entrada de dados do usuário.*/


import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite seu nome:" );
        funcionario.nome = sc.nextLine();

        System.out.print("Informe a Quantidade de horas trabalhadas: ");
        funcionario.horaTrabalhada = sc.nextInt();

        System.out.print("Informe o valor da hora: ");
        funcionario.valorHora = sc.nextFloat();

        System.out.print("Informe o desconto: ");
        funcionario.valorDesconto = sc.nextFloat();

        funcionario.apresentaValores();



    }
}