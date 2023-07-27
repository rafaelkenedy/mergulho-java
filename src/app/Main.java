import modelo.Conta;
import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa("Rafael");

        Conta minhaConta = new Conta(titular1, 987, 987);

        minhaConta.depositar(15_000);


        minhaConta.sacar(1_000);

        System.out.println("Saldo: " + minhaConta.getSaldo());

    }
}