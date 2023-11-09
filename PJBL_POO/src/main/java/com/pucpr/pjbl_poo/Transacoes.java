/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pucpr.pjbl_poo;

/**
 *
 * @author bernardo.jakubiak
 */
interface Transacoes {
    void depdepositSaldo(double valor);
    void transferMoney (ContasBancarias contaDestino, double valor);
    void withdrawMoney(double valor);
}
