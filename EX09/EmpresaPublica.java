package EX09;

public class EmpresaPublica extends Empresa{
    @Override
    public boolean cobranca() {
        System.out.println("METADE DO VALOR");

        return false;
    }
}
