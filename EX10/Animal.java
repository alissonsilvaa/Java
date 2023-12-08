package EX10;
public abstract class Animal {
    private String nome;
    public Animal(String nome) {
        nome = nome;
    }
    public void imprimir() {
        System.out.println("Nome: "+nome);
    }
    public String getName() {
        return(nome);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public abstract void falar();
}




