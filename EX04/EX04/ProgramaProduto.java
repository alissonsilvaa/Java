package EX04;

public class ProgramaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setQuantidadeEstoque(100);
        System.out.println(produto.getQuantidadeEstoque());

        produto.atualizarEstoque(5);


        System.out.println(produto.getQuantidadeEstoque());

    }
}