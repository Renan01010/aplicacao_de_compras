package br.com.alura.desafio.modulos.calculos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limte;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limte) {
        this.limte = limte;
        this.saldo = limte;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValor()){
              this.saldo -= compra.getValor();
              this.compras.add(compra);
              return true;
        }
        return false;
    }

    public double getLimte() {
        return limte;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }



}
