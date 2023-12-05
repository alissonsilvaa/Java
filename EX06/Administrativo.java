package EX06;

public class Administrativo extends Assistente{
    private boolean isDia;

    public boolean isDia() {
        return isDia;
    }

    public void setDia(boolean dia) {
        isDia = dia;
    }

    public void addAumento(){
        if (!isDia){
                setSalario(getSalario()* 1.2);
        }
    }
}
