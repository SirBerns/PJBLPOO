package com.pucpr.pjbl_poo;

public class ContaPoupanca extends ContasBancarias {
    public ContaPoupanca(int numConta, double saldoContaPoupanca,String proprietarioConta) {
        super(numConta, saldoContaPoupanca, 0, proprietarioConta);
    }

    @Override
    public double getSaldo(){
        return super.saldoContaPoupanca;
    }

    @Override
    public String toString(){
        return "Número da conta-poupança: " + super.getNumConta();
    }

}