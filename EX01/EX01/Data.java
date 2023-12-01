package EX01;

/*
. Crie um construtor para a classe Data que receba por parâmetro três
valores inteiros referentes ao dia, mês e ano e atribua os valores
passados por parâmetro aos atributos dia, mês e ano,
respectivamente.
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia == 25 || mes == 12){
            this.dia = dia;
            System.out.println("Feliz Natal ");
        }else {
            System.out.println("Não é Natal ");
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public void apresentaAno() {
        System.out.println(dia + "/" + mes + "/" + ano);


    }
}
