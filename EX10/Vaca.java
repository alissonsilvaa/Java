package EX10;

public  class Vaca extends Animal {

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("VACA");

    }
}
