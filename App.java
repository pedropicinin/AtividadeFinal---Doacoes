import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> doacoes = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Dinheiro");
            System.out.println("2 - Alimento");
            System.out.println("3 - Roupa");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.print("Valor: ");
                        double valor = Double.parseDouble(scanner.nextLine());
                        Dinheiro dinheiro = new Dinheiro(valor);
                        dinheiro.salvar();
                        doacoes.add(dinheiro);
                        break;
                    case "2":
                        System.out.print("Nome do Produto: ");
                        String nomeAlimento = scanner.nextLine();
                        System.out.print("Quantidade: ");
                        int quantidade = Integer.parseInt(scanner.nextLine());
                        Alimento alimento = new Alimento(nomeAlimento, quantidade);
                        alimento.salvar();
                        doacoes.add(alimento);
                        break;
                    case "3":
                        System.out.print("Nome do Produto: ");
                        String nomeRoupa = scanner.nextLine();
                        System.out.print("Tamanho: ");
                        String tamanho = scanner.nextLine();
                        Roupa roupa = new Roupa(nomeRoupa, tamanho);
                        roupa.salvar();
                        doacoes.add(roupa);
                        break;
                    case "4":
                        if (doacoes.isEmpty()) {
                            System.out.println("Nenhuma doação registrada.");
                        } else {
                            System.out.println("Doações registradas:");
                            for (Object doacao : doacoes) {
                                System.out.println(doacao.toString());
                            }
                        }
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }
}
