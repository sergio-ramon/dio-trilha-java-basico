package com.dio.exercicio.contabanco.teste;

import com.dio.exercicio.contabanco.dominio.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta contaCliente = new Conta();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque!",
                contaCliente.getNomeCliente(),
                contaCliente.getAgencia(),
                contaCliente.getNumero(),
                contaCliente.getSaldo()
        );
    }
}