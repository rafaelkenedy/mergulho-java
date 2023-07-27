package modelo;

public class CaixaEletronico {
     public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documentoPagavel, Conta conta){
         if (documentoPagavel.estaPago()){
             throw new IllegalStateException("Documento já está pago");
         }
         conta.sacar(documentoPagavel.getValorTotal());
         documentoPagavel.quitarPagamento();
    }
}
