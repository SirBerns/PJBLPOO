package com.pucpr.pjbl_poo;

public class ContaCorrente extends ContasBancarias{
    public ContaCorrente(int numConta, double saldoContaCorrente, String proprietarioConta) {
        super(numConta, 0, saldoContaCorrente, proprietarioConta);
    }

    @Override
    public double getSaldo(){
        return super.saldoContaCorrente;
    }

    @Override
    public String toString(){
        return "Número da conta-corrente: " + super.getNumConta();
    }
}
