import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in); // Criando instancias
        FileReader fr = new FileReader("USO.txt");
        BufferedReader arqReader = new BufferedReader(fr);
        String linha = "";
        int opcao = 0;
        String opcaoPlaca;
        int retornar = 0;
        Lista listaVagas = new Lista();

        linha = arqReader.readLine(); // Lendo a primeira linha do arquivo

        while (linha != null) { // Loop para ler todas as linhas do arquivos
            String placa = linha.split(";")[0]; // Split para quebrar o conteudo do arquivo
            String id = linha.split(";")[1]; // e atribuir a uma variavel
            String entrada = linha.split(";")[2];
            String saida = linha.split(";")[3];

            UsoDeVagas uso = new UsoDeVagas(placa, id, entrada, saida); // Instanciando a classe UsoDeVagas
            listaVagas.inserir(uso); // Preenchendo a lista de vagas de estacionamento
            linha = arqReader.readLine(); // Lendo a próxima linha do arquivo
        }
        menu();
        opcao = reader.nextInt();
        System.out.println("");

        do {
            switch (opcao) {
                case 1:
                    System.out.println("Digite a placa do veículo: ");
                    opcaoPlaca = reader.next();
                    System.out.println("");
                    System.out.println(listaVagas.localizar(opcaoPlaca));
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Digite a placa do veículo: ");
                    opcaoPlaca = reader.next();
                    System.out.println("");
                    System.out.println(
                            "A vaga abaixo foi removida com sucesso da lista: \n\n" + listaVagas.retirar(opcaoPlaca));
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Lista completa de vagas: \n" + listaVagas.toString());
                    System.out.println("");
                default:
                    break;
            }
        } while (retornar == 1);

    }

    public static void menu() {
        System.out.println("_____________________________");
        System.out.println("");
        System.out.println("        ESTACIONAMENTO");
        System.out.println("");
        System.out.println("_____________________________");

        System.out.println("<1> Localizar uma vaga, informando a placa do veículo");
        System.out.println("<2> Remover uma vaga, informando a placa do veículo");
        System.out.println("<3> Verificar todas as vagas");
        System.out.println("");

        System.out.println("Escolha uma das opções acima: ");
    }
}