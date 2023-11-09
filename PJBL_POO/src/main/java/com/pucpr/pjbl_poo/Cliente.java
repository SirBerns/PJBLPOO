package com.pucpr.pjbl_poo;

public class Cliente extends ContasBancarias {
    private final String nome;
    private final int cpf;
    private final int cep;

    public Cliente(String nome, int cpf, int cep, int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        super(numConta, saldoConta, nomeConta, proprietarioConta);
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }
    
    
    public void addConta() {
    };

    public double getSaldo(){
        return this.saldoConta;
    }


}
