package EX02;


import java.util.Scanner;

public class ProgramaRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o lado \'A\' do retangulo: ");
        double ladoA = sc.nextDouble();
        System.out.println();
        System.out.print("Digite o lado \'B\' do retangulo: ");
        double ladoB = sc.nextDouble();
        System.out.println();
        System.out.print("Digite o lado \'Altura\' do retangulo: ");
        double altura = sc.nextDouble();


        retangulo.setLadoA(ladoA);
        retangulo.setLadoB(ladoB);
        retangulo.setAltura(altura);
        retangulo.setCor("Branco");

        System.out.println("Area: " + retangulo.getArea()+" m²");
        System.out.println("Perimetro: " + retangulo.getPerimetro()+" m");
        System.out.println("Volume: " + retangulo.getVolume()+" m³");



        Retangulo retangulo2 = new Retangulo();


        double ladoB2 = sc.nextDouble();


        System.out.print("Digite o lado \'A\' do retangulo: ");
        retangulo.setLadoA(sc.nextDouble());
        System.out.print("Digite o lado \'B\' do retangulo: ");
        retangulo.setLadoB(sc.nextDouble());
        System.out.print("Digite o lado \'Altura\' do retangulo: ");
        retangulo.setAltura(sc.nextDouble());
        retangulo.setCor("Branco");

        System.out.println("Area: " + retangulo.getArea()+" m²");
        System.out.println("Perimetro: " + retangulo.getPerimetro()+" m");
        System.out.println("Volume: " + retangulo.getVolume()+" m³");




    }


}