package BancoDigital;

public class CPoupanca extends Conta {
    public CPoupanca(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
    }
}
