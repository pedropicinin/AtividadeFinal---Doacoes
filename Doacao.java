import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doacao {
    private List<Object> produtos;
    private int id;
    private Date data;

    public Doacao(int id, Date data){
        produtos = new ArrayList<>();
        this.id = id;
        this.data = data;
    }

    public void adicionarProduto(Object produto){
        produtos.add(produto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Object> getProdutos() {
        return produtos;
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder("Doacao ID: " + id + ", Data: " + data + "\nProdutos:\n");
        for (Object produto : produtos) {
            descricao.append(produto.toString()).append("\n");
        }
        return descricao.toString();
    }
}
