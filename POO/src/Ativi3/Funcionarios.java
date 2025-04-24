package Ativi3;

import java.math.BigDecimal;
//os objetos
public class Funcionarios {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionarios(String nome, int matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    public Funcionarios(){
    }

    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
