import java.io.*;

public class Cliente extends ContasBancarias implements Serializable {
    private final String nome;
    private final int cpf;
    private final int cep;

    public Cliente(String nome, int cpf, int cep, int numConta, double saldoConta, String nomeConta, String proprietarioConta){
        super(numConta, saldoConta, nomeConta, proprietarioConta);
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }

    public double getSaldo(){
        return this.saldoConta;
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
