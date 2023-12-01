package EX04;

/*Crie uma classe "Produto" que tenha como atributos o nome, o preço,
a quantidade em estoque, a marca e a descrição do produto, e
como método a atualização da quantidade em estoque após uma
venda.*/
public class Produto {
    private String nome;
    private String descricao;
    private String marca;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void atualizarEstoque(int quantidadeVendida){

        if (quantidadeVendida>0 && quantidadeVendida <= getQuantidadeEstoque() ){

            setQuantidadeEstoque(getQuantidadeEstoque() - quantidadeVendida);
        }
    }
}