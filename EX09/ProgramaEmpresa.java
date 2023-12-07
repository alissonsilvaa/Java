package EX09;

import java.util.ArrayList;

public class ProgramaEmpresa {
    public static void main(String[] args) {
        EmpresaPrivada empresaPrivada = new EmpresaPrivada();
        empresaPrivada.setNome("SENAI");
        empresaPrivada.setCnpj("12345678999999");

        EmpresaPrivada empresaPrivada2 = new EmpresaPrivada();
        empresaPrivada2.setNome("SENAC");
        empresaPrivada2.setCnpj("12345678999999");

        EmpresaPublica empresaPublica = new EmpresaPublica();
        empresaPublica.setNome("SABESP");
        empresaPublica.setCnpj("545151651651515");

        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(empresaPublica);
        empresas.add(empresaPrivada);
        empresas.add(empresaPrivada2);

        for (int i = 0; i < empresas.size(); i++){
            System.out.println(empresas.get(i));
            System.out.println(empresas.get(i).cobranca());
            System.out.println("********************************");
        }

        //System.out.println(empresas.toString());


    }
}
