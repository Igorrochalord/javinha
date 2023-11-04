import java.util.List;
public class MinhaAplicacao {
    public static void main(String[] args) {
        CadastroDeAlunos cadastro = new CadastroDeAlunos();

        // Adicionar alunos ao cadastro
        Aluno aluno1 = new Aluno("João", 20, "123");
        Aluno aluno2 = new Aluno("Maria", 21, "456");

        cadastro.adicionarAluno(aluno1);
        cadastro.adicionarAluno(aluno2);

        // Listar alunos cadastrados
        List<Aluno> alunos = cadastro.listarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Matrícula: " + aluno.getMatricula());
        }

        // Remover um aluno
        cadastro.removerAluno(aluno1);

        // Listar novamente para verificar a remoção
        alunos = cadastro.listarAlunos();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
