package Ativi2;

public class Pacientes {
    private String nome;
    private float cpf;
    private String email;

    Pacientes(String nome, float cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public Pacientes(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
