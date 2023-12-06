package EX08;
/*
Classe Pessoa:
• Atributos adicionais:
• email do tipo String
• telefone do tipo String
• Métodos adicionais:
• aniversario(): incrementa a idade da pessoa em
um.
• atualizarContato(String novoEmail, String
novoTelefone): atualiza o email e o telefone da
pessoa.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String aniversario(){
        this.setIdade(this.getIdade()+1);
        return "EU SOU "+this.getNome()+
                " E TENHO "+this.getIdade()+" ANOS.";
    }

    public void atualizarContato(String novoEmail, String novoTelefone){
        this.setEmail(novoEmail);
        this.setTelefone(novoTelefone);
    }

    @Override
    public String toString() {
        return "\t\t_______________________________ " +
                "\n\tTIPO: " + getClass() +
                "\n\t\tNOME: " + getNome() +
                "\n\t\tIDADE: " + getIdade() +
                "\n\t\tEMAIL: " + getEmail() +
                "\n\t\tTELEFONE: " + getTelefone();
    }
}
