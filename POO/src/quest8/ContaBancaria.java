package quest8;

public class ContaBancaria {
    private int numeroDaConta;
    private int saldo;

    ContaBancaria(int numeroDaConta, int saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public ContaBancaria(){
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String
    toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}
