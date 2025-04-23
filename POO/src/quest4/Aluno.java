package quest4;

public class Aluno {
    private String nome;
    private String matricula;
    private int notaFinal;

    Aluno(String nome, String matricula, int notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }
    public Aluno(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
