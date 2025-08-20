package HandsOn.Desafio2Aluno;

public class AlunoFiap {
    String nomeAluno;
    int matricula;
    EnderecoAluno enderecoAluno = new EnderecoAluno();
    CidadeAluno cidadeAluno = new CidadeAluno();


    public AlunoFiap(String nomeAluno, int matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public AlunoFiap() {}
}
