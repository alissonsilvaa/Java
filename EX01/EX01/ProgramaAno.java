package EX01;

import java.util.Scanner;
public class ProgramaAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.close();
        Data data = new Data();
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());
        data.apresentaAno();


    }
}
