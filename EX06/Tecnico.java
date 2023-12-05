package EX06;
/*
sabendo que os Assistentes Técnicos possuem um bônus salarial e
que os Assistentes Administrativos possuem um turno (dia ou noite) e
um adicional noturno, crie as classes Tecnico e Administrativo e
sobrescreva o método ganhoAnual() de ambas as classes
(Administrativo e Tecnico).
Crie um assistente administrativo e um técnico. Imprima o número de
matrícula e o nome de cada um deles.
 */
public class Tecnico extends Assistente{

    public void addAumento(double bonus){
        if (bonus>0){
            setSalario(getSalario()*(1+bonus/100));
        }
    }
}
