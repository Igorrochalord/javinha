import java.util.ArrayList;
import java.util.List;

public class CadastroDeAlunos {
    private List<Aluno> alunos;

    public CadastroDeAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public List<Aluno> listarAlunos() {
        return this.alunos;
    }

}
