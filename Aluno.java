/* Crie uma classe "Aluno" que tenha como atributos o nome, a nota do
aluno em uma prova, a média da turma e a disciplina, e como
método a verificação se o aluno foi aprovado ou não, considerando
uma nota de corte.
*/

public class Aluno {
    private String nome;
    private double nota;
    private double media;
    private String disciplina;
    private boolean aprovado;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getMedia() {
        return media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setMedia(double media) {
        if(media >= 7) {
            this.aprovado = true;
            System.out.println("Você está aprovado");
        }else{
            this.aprovado = false;
            System.out.println("Você está reprovado");
        }
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public void apresentaNotas(){
        System.out.println("Aprovado " +isAprovado());
        System.out.println("Nota " +getNota());
        System.out.println("Nome " +getNome());
        System.out.println("Disciplina " +getDisciplina());
        System.out.println("Media: " +getMedia());
        //System.out.println("Nota " +getNota());
    }

}
