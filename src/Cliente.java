public class Cliente extends ContasBancarias {
    private String nome;
    private int cpf;
    private int cep;

    public Cliente(String nome, int cpf, int cep, int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        super(numConta, saldoConta, nomeConta, proprietarioConta);
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }
    
    
    public void addConta() {
    };

    @Override
    public double getSaldo(){
        return this.saldoConta;
    }


}
