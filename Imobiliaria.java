
public class Imobiliaria {

    private String nome;
    private String compra;
    private String venda;
    private String locacao;
    private String tipoDeImovel;
    private String endereco;
    private String cep;
    private String bairro;
    private String cidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompra() {
        return compra;
    }
    public void setCompra(String compra) {
        this.compra = compra;
    }
    public String getVenda() {
        return venda;
    }
    public void setVenda(String venda) {
        this.venda = venda;
    }
    public String getLocacao() {
        return locacao;
    }
    public void setLocacao(String locacao) {
        this.locacao = locacao;
    }
    public String getTipoDeImovel() {
        return tipoDeImovel;
    }
    public void setTipoDeImovel(String tipoDeImovel) {
        this.tipoDeImovel = tipoDeImovel;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



   public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Compra: "+compra);
        System.out.println("Venda: "+venda);
        System.out.println("Locacao: "+locacao);
        System.out.println("Tipo de Imovel: "+tipoDeImovel);
        System.out.println("Endereço: "+endereco);
        System.out.println("CEP: "+cep);
        System.out.println("Bairro: "+bairro);
        System.out.println("Cidade: "+cidade);
   }




}
