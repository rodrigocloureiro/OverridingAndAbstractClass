public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    protected double getSaldo() { return saldo; }

    public void setSaldo(double valor) { saldo = valor; }

    public boolean depositar(double valor) {
        if (valor <= 0) return false;
        else {
            saldo += valor;
            return true;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract boolean sacar(double valor);
}
