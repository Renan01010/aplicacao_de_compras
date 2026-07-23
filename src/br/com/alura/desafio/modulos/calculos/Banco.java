package br.com.alura.desafio.modulos.calculos;

public class Banco {
    private String nome;
    private int numeroAgencia;
    private String nomePessoa;
    private double saldo;

    public Banco(String nome, int numeroAgencia, String nomePessoa, double saldo) {
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void depositar ( double saldo ){
        this.saldo+=saldo;
        System.out.println("Deposito Realizado!");
    }

}
