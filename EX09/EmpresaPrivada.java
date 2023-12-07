package EX09;

public class EmpresaPrivada extends Empresa {

    @Override
    public boolean cobranca() {
        System.out.println("DOBRO DO VALOR");

        return false;
    }
}
