package BancoDigital;

public class CCorrente extends Conta {
    public CCorrente(Clientes clientes) {
        super(clientes);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInfosComuns();



    }
}
