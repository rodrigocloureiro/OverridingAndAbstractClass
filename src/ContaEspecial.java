public class ContaEspecial extends Conta {
    private double limiteEspecial;

    public ContaEspecial(int numero, double saldo, double limiteEspecial) {
        super(numero, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > limiteEspecial + getSaldo() || valor == 0) return false;
        else {
            setSaldo(getSaldo() - valor);
            return true;
        }
    }
}
