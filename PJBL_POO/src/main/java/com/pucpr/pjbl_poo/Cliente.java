package com.pucpr.pjbl_poo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {
    private String nome;
    private String cpf;
    private String cep;
    private ContaPoupanca poupanca;
    private ContaCorrente corrente;
    private List<Double> totalTransacoes;

    public Cliente(String nome, String cpf, String cep, ContaPoupanca poupanca, ContaCorrente corrente){
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.poupanca = poupanca;
        this.corrente = corrente;
        this.totalTransacoes = new ArrayList<>();
    }

    // Getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para 'cpf'
    public String getCpf() {
        return cpf;
    }

    // Setter para 'cpf'
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para 'cep'
    public String getCep() {
        return cep;
    }

    // Setter para 'cep'
    public void setCep(String cep) {
        this.cep = cep;
    }

    // Getter para 'poupanca'
    public ContaPoupanca getPoupanca() {
        return poupanca;
    }

    // Setter para 'poupanca'
    public void setPoupanca(ContaPoupanca poupanca) {
        this.poupanca = poupanca;
    }

    // Getter para 'corrente'
    public ContaCorrente getCorrente() {
        return corrente;
    }

    // Setter para 'corrente'
    public void setCorrente(ContaCorrente corrente) {
        this.corrente = corrente;
    }

    // Getter para totalTransacoes
    public List<Double> getTotalTransacoes() {
        return totalTransacoes;
    }

    public Double totalTransicionado() {
        Double total = 0.0;

        for (Double transacao : this.totalTransacoes) {
            total += Math.abs(transacao);
        }
        return total;
    }

    // Método para serializar o objeto
    public void serializarCliente(String nomeArquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(this);
            System.out.println("Objeto Cliente serializado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para desserializar o objeto
    public static Cliente desserializarCliente(String nomeArquivo) {
        Cliente cliente = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            cliente = (Cliente) inputStream.readObject();
            System.out.println("Objeto Cliente desserializado com sucesso.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cliente;
    }

}
