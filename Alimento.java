import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Alimento {
    private String nome;
    private int quantidade;

    public Alimento(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Alimento: " + nome + ", Quantidade: " + quantidade;
    }

    public void salvar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("doacoes.txt", true))) {
            writer.write(toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar doação: " + e.getMessage());
        }
    }
}
