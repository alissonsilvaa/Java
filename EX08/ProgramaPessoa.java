package EX08;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Rica p1 = new Rica();
        p1.setIdade(33);
        p1.setNome("Alisson");
        p1.setDinherio(200000);


        Pobre p2 = new Pobre();
        p2.setIdade(32);
        p2.setNome("Pedro");

        Miseravel p3 = new Miseravel();
        p3.setIdade(32);
        p3.setNome("Zé da Esquina");

        System.out.println(p1.fazCompras());
        System.out.println(p2.trabalha());
        System.out.println(p3.mendiga());



    }
}
