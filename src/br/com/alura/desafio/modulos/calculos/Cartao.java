package br.com.alura.desafio.modulos.calculos;

public class Cartao extends Banco{
    private double saldoCredito;
    private int numeroCartao;


    public Cartao(String nome, int numeroAgencia, String nomePessoa, double saldo, double saldoCredito, int numeroCartao) {
        super(nome, numeroAgencia, nomePessoa, saldo);
        this.saldoCredito = saldoCredito;
        this.numeroCartao = numeroCartao;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setSaldoCredito(double saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public void pagarComCredito(Produtos produto){
        double valor = produto.valorTotal();
        if(valor <= this.saldoCredito){
            System.out.println("Pago com cartão de Crédito -" + valor);
            this.saldoCredito-=produto.valorTotal();
            System.out.println("Saldo restante: " + this.saldoCredito);
        }else{
            System.out.println("Saldo insuficiente: (" + this.saldoCredito + ")");
        }
    }

}
