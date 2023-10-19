package com.pucpr.pjbl_poo;

interface Transacoes {
    void depdepositSaldo(double valor);
    boolean transferMoney (ContasBancarias contaDestino, double valor);
    void withdrawMoney(double valor);
}
