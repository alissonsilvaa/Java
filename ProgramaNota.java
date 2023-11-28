

import java.util.Scanner;

public class ProgramaNota {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(input.nextLine());
            System.out.println("Digite a nota do aluno: ");
            aluno.setNota(input.nextDouble());
            System.out.println("Digite a media da turma: ");
            aluno.setMedia(input.nextDouble());
            System.out.println("Digite a disciplina do aluno: ");
            aluno.setDisciplina(input.next());

            aluno.apresentaNotas();


        }
    }

