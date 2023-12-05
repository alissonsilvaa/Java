package EX05;

public class ProgramaHeranca {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Alisson Silva");
        professor.setCpf("401.811.748-55");
        professor.setDataNascimento("08/08/1991");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua dos Cachorros");
        endereco.setNumero(123);
        endereco.setComplemento("Apto");
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("04055-041");
        professor.setEndereco(endereco);

        System.out.println(professor);

    }
}
