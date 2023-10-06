abstract public class ContasBancarias {
    protected int numConta;
    protected double saldoConta;
    protected String nomeConta;
    protected String proprietarioConta;

    public ContasBancarias(int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        this.numConta = numConta;
        this.saldoConta = saldoConta;
        this.nomeConta = nomeConta;
        this.proprietarioConta = proprietarioConta;

    }

    public abstract double getSaldo();
}
