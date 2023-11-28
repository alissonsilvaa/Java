
public class Programa {

    public static void main(String[] args) {

        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.setNome("Alisson Silva");
        imobiliaria.setCompra("1000");
        imobiliaria.setVenda("2000");
        imobiliaria.setLocacao("Apartamento");
        imobiliaria.setTipoDeImovel("Casa");
        imobiliaria.setEndereco("Rua 123");
        imobiliaria.setCep("12345");
        imobiliaria.setBairro("Centro");
        imobiliaria.setCidade("Sao Paulo");

        imobiliaria.mostrarDados();


    }
}
