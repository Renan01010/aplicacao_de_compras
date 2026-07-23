package br.com.alura.desafio.modulos.calculos;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



    public double valorTotal (){
        return this.preco * this.quantidade;
    }

}
