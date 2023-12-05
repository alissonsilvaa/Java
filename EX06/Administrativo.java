package EX06;

public class Administrativo extends Funcionario {
    private boolean isDia;

    public void addAumento(){
        if (!isDia){
                setSalario(getSalario()* 1.2);

        }

    }

}
