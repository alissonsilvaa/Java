public class Funcionario {
    String nome;
    float valorHora;
    int horaTrabalhada;
   float valorDesconto;

   public void  apresentaValores(){
       System.out.println("Folha de pagamento: " + nome);
       System.out.println(horaTrabalhada + "horas x R$ " + valorHora + " = R$   " + valorHora * horaTrabalhada);
       System.out.println("Descontos: R$ " + valorDesconto);
       System.out.println("Total devido: R$ " + (valorHora * horaTrabalhada - valorDesconto));


   }
}

