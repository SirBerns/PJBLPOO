import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numeroConta;
    private String titularConta;
    private double saldo;
    private List<Transacao> historico;

    public ContaBancaria(String numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add(new Transacao("Depósito", valor));
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.add(new Transacao("Saque", valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            historico.add(new Transacao("Transferência para " + contaDestino.titularConta, valor));
            System.out.println("Transferência de R$" + valor + " para " + contaDestino.titularConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
