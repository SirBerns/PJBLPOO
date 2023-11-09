package com.pucpr.pjbl_poo;

import java.util.ArrayList;
import java.util.List;

abstract public class ContasBancarias {
    protected int numConta;
    protected double saldoConta;
    protected String nomeConta;
    protected String proprietarioConta;
    private List<Transacao> historico;

    public ContasBancarias(int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        this.numConta = numConta;
        this.saldo = 0.0;
        this.nomeConta = nomeConta;
        this.proprietarioConta = proprietarioConta;
        this.historico = new ArrayList<>();

    }

    void depdepositSaldo(double valor) {
        if (valor > 0) {
            saldoConta += valor;
            historico.add(new Transacao("Depósito", valor));
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void withdrawMoney(double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            historico.add(new Transacao("Saque", valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferMoney(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            contaDestino.depositar(valor);
            historico.add(new Transacao("Transferência para " + contaDestino.titularConta, valor));
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.titularConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo da conta de " + titularConta + ": R$" + saldoConta);
    }

    public void imprimirHistorico() {
        System.out.println("Histórico de transações da conta de " + titularConta + ":");
        for (Transacao transacao : historico) {
            System.out.println(transacao);
        }
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("123456", "João");
        ContaBancaria outraConta = new ContaBancaria("789012", "Maria");

        minhaConta.depositar(1000);
        minhaConta.sacar(500);

        minhaConta.transferir(outraConta, 200);

        minhaConta.verificarSaldo();
        outraConta.verificarSaldo();

        minhaConta.imprimirHistorico();
        outraConta.imprimirHistorico();
    }
}
class Transacao {
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return tipo + ": R$" + valor;
    }
}
