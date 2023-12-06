package EX08;
/*
Classe Miseravel que também herda de Pessoa:
• Métodos adicionais:
• procurarRecursos(): simula a busca por recursos
básicos como comida e abrigo.
• receberDoacao(double valor): aumenta o dinheiro
da pessoa com o valor recebido da doação.
--------------------------------x----------------------------------------------------------------
Implementações Específicas:
• Para a classe Pessoa, você pode implementar um método
imprimirInformacoes() que exibe todos os dados da pessoa,
incluindo email e telefone.
• Na classe Rica, você pode implementar métodos para calcular
o total investido e para gerar um relatório de investimentos.
• Na classe Pobre, implemente uma lógica para que o método
trabalha() aumente as horasTrabalhadas e,
consequentemente, o dinheiro, baseado no valorPorHora.
• Na classe Miseravel, o método procurarRecursos() pode ter uma
chance aleatória de aumentar uma pequena quantidade de
dinheiro, representando a busca por ajuda.
 */
public class Miseravel  extends Pessoa{

    public procurarRecursos(){
        return

    }
    public String mendiga(){
        return "EU SOU "+getNome() +
                " TENHO 32 ANOS "+getIdade()
                + " SOU MÃO DE VACA ";
    }
}
