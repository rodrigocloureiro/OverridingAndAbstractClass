public class ContaComum extends Conta {
    public ContaComum(int numero, double saldo) {
        super(numero, saldo);
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
