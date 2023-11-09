package com.pucpr.pjbl_poo;

public class ContasPoupanca extends ContasBancarias {

    public ContasPoupanca(int numConta, double saldoConta, String nomeConta, String proprietarioConta) {
        super(numConta, saldoConta, nomeConta, proprietarioConta);
    }

    public double getSaldo(){
        return this.saldoConta;
    }

    public void addFees(){       
    };
}