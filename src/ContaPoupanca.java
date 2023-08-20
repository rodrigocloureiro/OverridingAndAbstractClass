public class ContaPoupanca extends Conta {
    private double percentualRendimento;

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    public ContaPoupanca(int numero, double saldo, double percentualRendimento) {
        super(numero, saldo);
        this.percentualRendimento = percentualRendimento;
    }

    public void render() {
        setSaldo(getSaldo() * (1+percentualRendimento/100));
    }

    public void render(double percentualRendimento) {
        setSaldo(getSaldo() * (1+percentualRendimento/100));
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > getSaldo() || valor == 0) return false;
        else {
            setSaldo(getSaldo() - valor);
            return true;
        }
    }
}
