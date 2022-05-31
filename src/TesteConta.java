import BancoDigital.CCorrente;
import BancoDigital.CPoupanca;
import BancoDigital.Clientes;
import BancoDigital.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes();
        cliente1.setNomeCliente("Bárbara Macieira");

        Conta cc = new CCorrente(cliente1);
        Conta cp = new CPoupanca(cliente1);

        cc.depositar(250);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}