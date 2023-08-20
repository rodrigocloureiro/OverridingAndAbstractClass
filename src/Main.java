public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaComum(12345, 1500);
        Conta ce = new ContaEspecial(67890, 48500, 120000);
        ContaPoupanca cp = new ContaPoupanca(10111213, 6790.90);

        System.out.println("Saldo Conta Comum: R$ " + cc.consultarSaldo());
        System.out.println("Saldo Conta Especial: R$ " + ce.consultarSaldo());
        System.out.println("Saldo Conta Poupança: R$ " + cp.consultarSaldo());

        System.out.println("\n------- Conta Comum -------\n");

        if (cc.depositar(-200))
            System.out.println("Saldo após depósito: R$ " + cc.consultarSaldo());
        else
            System.out.println("Não foi possível depositar!");
        cc.depositar(1350);
        System.out.println("Saldo após depósito: R$ " + cc.consultarSaldo());
        cc.sacar(2800.50);
        System.out.println("Saldo após saque: R$ " + cc.consultarSaldo());
        if (cc.sacar(100))
            System.out.println("Saldo após saque: R$ " + cc.consultarSaldo());
        else
            System.out.println("Não foi possível realizar o saque!");

        System.out.println("\n------- Conta Especial -------\n");

        ce.depositar(1500.00);
        System.out.println("Saldo após depósito: R$ " + ce.consultarSaldo());
        ce.sacar(45000);
        System.out.println("Saldo após saque: R$ " + ce.consultarSaldo());
        ce.sacar(4000);
        System.out.println("Saldo após saque: R$ " + ce.consultarSaldo());
        ce.sacar(2200);
        System.out.println("Saldo após saque: R$ " + ce.consultarSaldo());
        ce.sacar(118000);
        System.out.println("Saldo após saque: R$ " + ce.consultarSaldo());
        if (ce.sacar(801))
            System.out.println("Saldo após saque: R$ " + ce.consultarSaldo());
        else
            System.out.println("Não foi possível realizar o saque!");

        System.out.println("\n------- Conta Poupança -------\n");

        System.out.println("Saldo: R$ " + cp.consultarSaldo());
        cp.depositar(3209.1);
        System.out.println("Saldo após depósito: R$ " + cp.consultarSaldo());
        cp.sacar(5000);
        System.out.println("Saldo após saque: R$ " + cp.consultarSaldo());
        if (cp.sacar(5001))
            System.out.println("Saldo após depósito: R$ " + cp.consultarSaldo());
        else
            System.out.println("Não foi possível realizar o saque!");
        cp.render(10);
        System.out.println("Saldo após rendimento: R$ " + cp.consultarSaldo());
    }
}
