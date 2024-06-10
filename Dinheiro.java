import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dinheiro {
    private double valor;

    public Dinheiro(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Dinheiro: R$ " + valor;
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
