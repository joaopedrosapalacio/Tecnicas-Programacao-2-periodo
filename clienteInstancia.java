
import java.util.Scanner;

public class clienteInstancia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        boolean continuar = true;

        do {
            System.out.println("-----------MENU------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Exibir");
            System.out.println("0 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    cliente.setCadastrar(nome, cpf, idade);
                }
                case 2 -> {
                    System.out.print("Digite o novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o novo CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a nova idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    cliente.setAlterar(nome, cpf, idade);
                }
                case 3 ->
                    System.out.println(cliente.getExibir());
                case 0 ->
                    continuar = false;
                default ->
                    System.out.println("Opção inválida!");
            }
        } while (continuar);

        System.out.println("Programa encerrado.");
    }
}
