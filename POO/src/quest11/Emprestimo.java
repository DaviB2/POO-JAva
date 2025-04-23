package quest11;

public class Emprestimo {
    private int valor;
    private int dataDeEmprestimo;
    private int numeroDeParcelas;

    Emprestimo(int valor, int dataDeEmprestimo, int numeroDeParcelas){
        this.valor = valor;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.numeroDeParcelas = numeroDeParcelas;
    }
    public Emprestimo(){
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(int dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "valor=" + valor +
                ", dataDeEmprestimo=" + dataDeEmprestimo +
                ", numeroDeParcelas=" + numeroDeParcelas +
                '}';
    }
}
