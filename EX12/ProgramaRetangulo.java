package EX12;

import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.print("Digite a Altura do Retangulo: ");
        retangulo.setAltura(input.nextDouble());
        System.out.print("Digite a Base do Retangulo: ");
        retangulo.setBase(input.nextDouble());
        System.out.print("Digite o Area do Retangulo: ");
        retangulo.setArea(input.nextDouble());
        System.out.print("Digite o Peso do Retangulo: ");
        retangulo.setPeso(input.nextDouble());
        System.out.println("O Area Total do Retangulo "+retangulo.getArea());
        System.out.println("O Volume Total é de: "+retangulo.getVolume());
        System.out.println("O Peso Total é de: "+retangulo.getPesoEspecifico());
    }
}
