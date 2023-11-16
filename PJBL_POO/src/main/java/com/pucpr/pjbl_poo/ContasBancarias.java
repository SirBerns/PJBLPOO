package com.pucpr.pjbl_poo;

import java.util.ArrayList;
import java.util.List;

abstract public class ContasBancarias {
    protected int numConta;
    protected double saldoContaPoupanca;
    protected double saldoContaCorrente;
    protected double saldoTotal;
    protected String proprietarioConta;

    // Getter para 'numConta'
    public int getNumConta() {
        return numConta;
    }

    // Setter para 'numConta'
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    // Getter para 'saldoContaPoupanca'
    public double getSaldoContaPoupanca() {
        return saldoContaPoupanca;
    }

    // Setter para 'saldoContaPoupanca'
    public void setSaldoContaPoupanca(double saldoContaPoupanca) {
        this.saldoContaPoupanca = saldoContaPoupanca;
    }

    // Getter para 'saldoContaCorrente'
    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    // Setter para 'saldoContaCorrente'
    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    // Getter para 'proprietarioConta'
    public String getProprietarioConta() {
        return proprietarioConta;
    }

    // Setter para 'proprietarioConta'
    public void setProprietarioConta(String proprietarioConta) {
        this.proprietarioConta = proprietarioConta;
    }


    public ContasBancarias(int numConta, double saldoContaPoupanca, double saldoContaCorrente, String proprietarioConta) {
        this.numConta = numConta;
        this.saldoContaPoupanca = saldoContaPoupanca;
        this.saldoContaCorrente = saldoContaCorrente;
        this.proprietarioConta = proprietarioConta;
        this.saldoTotal = saldoContaCorrente + saldoContaPoupanca;
    }

    public double getSaldo() {
        return this.saldoTotal;
    }
}
