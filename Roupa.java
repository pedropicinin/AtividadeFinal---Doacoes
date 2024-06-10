import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Roupa {
    private String nome;
    private String tamanho;

    public Roupa(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Roupa: " + nome + ", Tamanho: " + tamanho;
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
