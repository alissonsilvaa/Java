package EX06;

public class ProgramaEmpresa {
    public static void main(String[] args) {
        Administrativo adm = new Administrativo();
        Tecnico tec = new Tecnico();
        adm.setNome("Alisson Silva");
        adm.setSalario(25000);
        adm.setAddAumento(500);
        //System.out.println(adm.getGanhoAnual());
        System.out.println(adm);

        tec.setNome("Maria");
        tec.setSalario(10000);
        tec.setAddAumento(500);
        System.out.println(tec);
        //System.out.println(tec.getGanhoAnual());

    }
}
