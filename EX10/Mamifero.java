package EX10;

public abstract class Mamifero extends Animal
{
    public Mamifero(String nome) {
        super(nome);
    }
    public abstract void falar();{
        System.out.println("MAMIFERO");
    }
}

