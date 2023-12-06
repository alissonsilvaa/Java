package EX08;
/*
Classe Rica que herda de Pessoa:
• Atributos adicionais:
• portifolioDeInvestimentos do tipo ArrayList
• Métodos adicionais:
• adicionarInvestimento(String tipo, double valor):
adiciona um novo investimento ao portfólio.
• removerInvestimento(String tipo): remove um
investimento do portfólio.

   */
public class Rica  extends Pessoa{

    private double dinherio;
    private ArrayList<Investimento> portifolioDeInvestimentos = new ArrayList<>();

    public double getDinherio() {
        return dinherio;
    }

    public void setDinherio(double dinherio) {
        this.dinherio = dinherio;
    }

    public adicionarInvestimento(String tipo, double valor) {
        portifolioDeInvestimentos.add(new Investimento(tipo, valor));
    }
    public removerInvestimento(String tipo){
        portifolioDeInvestimentos.remove(new Investimento(tipo));
    }
    public String fazCompras(){
       return "EU SOU "+getNome() +
               " MINHA IDADE É DE "+getIdade()
               + " ANOS E A QUANTIDADE DE DINHERIO "+getDinherio()+ " DE REAIS";
   }
}
