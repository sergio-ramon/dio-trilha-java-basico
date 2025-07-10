package com.dio.exercicio.contabanco.teste;

import com.dio.exercicio.contabanco.dominio.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta contaCliente = new Conta();

        System.out.println("Por favor, digite o número da conta:");
        contaCliente.setNumero(scan.nextInt());
        System.out.println("Digite o número da agência:");
        contaCliente.setAgencia(scan.next());
        System.out.println("Digite o seu nome:");
        contaCliente.setNomeCliente(scan.next());
        System.out.println("Digite o valor do depósito inicial:");
        contaCliente.setSaldo(scan.nextDouble());

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque!",
                contaCliente.getNomeCliente(),
                contaCliente.getAgencia(),
                contaCliente.getNumero(),
                contaCliente.getSaldo()
        );
    }
}