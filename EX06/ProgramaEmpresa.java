package EX06;

public class ProgramaEmpresa {

    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo();
        administrativo.setNome("Leandro");
        administrativo.setSalario(25000);
        administrativo.setNumeroDeMatricula(123);
        administrativo.setDia(false);

        System.out.println(administrativo);

        administrativo.addAumento();

        System.out.println(administrativo);

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Gustavo");
        tecnico.setSalario(3500);
        tecnico.setNumeroDeMatricula(321);
        System.out.println();
        System.out.println(tecnico);
        tecnico.addAumento(50);
        System.out.println(tecnico);

        Assistente assistente = new Assistente();
        assistente.setNome("Maria");
        assistente.setSalario(7000);
        assistente.setNumeroDeMatricula(555);
        System.out.println();
        System.out.println(assistente);
        assistente.addAumento(500);
        System.out.println(assistente);



    }


}
