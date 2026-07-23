package br.com.alura.desafio.modulos.principal;

import br.com.alura.desafio.modulos.calculos.Banco;
import br.com.alura.desafio.modulos.calculos.Cartao;
import br.com.alura.desafio.modulos.calculos.Produtos;

import java.util.Scanner;

import static java.lang.System.in;

public class PrincipalCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Cartao renan = new Cartao("Plux", 0001, "renan Teles de Oliveira", 2000, 5000, 4085);
        int op=5;
        Produtos produto1 = null;

        while (op!= 0){
            System.out.println("""
                ====================================
                      SISTEMA DE COMPRAS
                ====================================
                1 - Definir saldo do cartão
                2 - Depositar dinheiro
                3 - Cadastrar produto
                4 - Pagar produto
                0 - Sair
                ====================================
                Escolha uma opção:
                """);
            op=scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("*******************************");
                    System.out.println("Digite o Saldo do Cartão de crédito: ");
                    renan.setSaldoCredito(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("*******************************");
                    System.out.println("Deseja depositar valor ao seu saldo do cartão: ");
                    renan.depositar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("*******************************");
                    System.out.println("Oque está comprando: ");
                    String nome = scanner.nextLine();
                    System.out.println("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    produto1 = new Produtos(nome, preco, quantidade);
                    break;
                case 4:
                    System.out.println("*********************************");
                    System.out.println("Pagar com cartão: ");
                    renan.pagarComCredito(produto1);
                    break;
                case 0:
                    System.out.println("Saindo......");
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }
    }
}
