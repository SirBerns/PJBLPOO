package com.pucpr.pjbl_poo;

import java.util.ArrayList;
import java.util.List;

abstract public class ContasBancarias implements Transacoes {
    protected int numConta;
    protected double saldoConta;
    protected String nomeConta;
    protected String proprietarioConta;
    private final List<Transacao> historico;


    public ContasBancarias(int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        this.numConta = numConta;
        this.saldoConta = saldoConta;
        this.nomeConta = nomeConta;
        this.proprietarioConta = proprietarioConta;
        this.historico = new ArrayList<>();

    }

    @Override
    public void depdepositSaldo(double valor) {
        if (valor > 0) {
            saldoConta += valor;
            historico.add(new Transacao("Depósito", valor));
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void withdrawMoney(double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            historico.add(new Transacao("Saque", valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    @Override
    public void transferMoney(ContasBancarias contaDestino, double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            contaDestino.depdepositSaldo(valor);
            historico.add(new Transacao("Transferência para " + contaDestino.nomeConta, valor));
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.nomeConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo da conta de " + nomeConta + ": R$" + saldoConta);
    }

    public void imprimirHistorico() {
        System.out.println("Histórico de transações da conta de " + nomeConta + ":");
        for (Transacao transacao : historico) {
            System.out.println(transacao);
        }
    }

}
class Transacao {
    private final String tipo;
    private final double valor;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return tipo + ": R$" + valor;
    }
}
