package BancoDigital;

public interface FuncionalidadesConta {
    void sacar(double valor);
    void depositar(double valor);

    void transferir(double valor, FuncionalidadesConta contaDestino);

    void imprimirExtrato();
}
