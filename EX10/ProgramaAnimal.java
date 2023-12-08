package EX10;

public class ProgramaAnimal {
    public static void main(String[] args) {

        BemTeVi bemTeVi = new BemTeVi("bemTeVi");
        bemTeVi.imprimir();
        bemTeVi.falar();

        Cachorro cachorro = new Cachorro("TOTO");
        cachorro.imprimir();
        cachorro.falar();

        Papagaio papagaio = new Papagaio("FALA MUITO ");
        papagaio.imprimir();
        papagaio.falar();

        Vaca vaca = new Vaca("MUMUZINHA");
        vaca.imprimir();
        vaca.falar();




    }
}
