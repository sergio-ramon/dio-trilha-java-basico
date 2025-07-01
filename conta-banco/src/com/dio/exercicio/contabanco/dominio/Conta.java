package com.dio.exercicio.contabanco.dominio;

import java.util.Scanner;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    Scanner scan = new Scanner(System.in);

    public Conta() {
        System.out.println("Por favor, digite o número da conta:");
        numero = scan.nextInt();

        System.out.println("Digite o número da agência:");
        agencia = scan.next();

        System.out.println("Digite o seu nome:");
        nomeCliente = scan.next();

        System.out.println("Digite o valor do depósito inicial:");
        saldo = scan.nextFloat();
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getNomeCliente() { return nomeCliente; }
    public  void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

}
