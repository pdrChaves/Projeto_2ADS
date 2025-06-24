/**
 * @author Pedro, Cyrius
 */
import java.util.Scanner;
import java.util.List;

public class CadastroDeJogos {
    private List<itemColecao> colecao;
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("--------------------------------------------");
    System.out.println("Digite o nome do jogo: ");
    String nome = leitura.nextLine();
    System.out.println("Digite o gênero do jogo mencionado: ");
    String genero = leitura.nextLine();
    System.out.println("Digite o ano de lançamento: ");
    String dataLancamento = leitura.nextLine();
    System.out.print("Conte um pouco sobre: ");
    String comentario = leitura.nextLine();
    System.out.println("Cadastro concluído com sucesso!");
    System.out.println("--------------------------------------------");
    }
}