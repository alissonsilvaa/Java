package EX07;

public class ProgramaCachorro {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        dog.setNome(" Totó ");
        dog.setRaca(" Boxer ");

        Gato cat = new Gato();
        cat.setNome(" Mia ");
        cat.setRaca(" Persa ");

        System.out.println(dog.caminha());
        System.out.println();
        System.out.println(cat.caminha());



    }
}
