import java.util.Scanner;

public class produtoInstancia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Produto[] produtos = new Produto[10];
            int opcao;
            int contador = 0;
            
            do {
                System.out.println("===== MENU =====");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Exibir produtos");
                System.out.println("3 - Alterar uma informação");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {
                    case 1 -> {
                        if (contador >= produtos.length) {
                            System.out.println("Limite de produtos atingido!\n");
                            break;
                        }
                        
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o preço: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a validade: ");
                        String validade = scanner.nextLine();
                        System.out.print("Digite o tipo: ");
                        String tipo = scanner.nextLine();
                        System.out.print("Digite a marca: ");
                        String marca = scanner.nextLine();
                        
                        produtos[contador] = new Produto();
                        produtos[contador].setCadastrar(nome, preco, validade, tipo, marca);
                        System.out.println("Produto cadastrado com sucesso!\n");
                        contador++;
                    }
                    case 2 -> {
                        if (contador == 0) {
                            System.out.println("Nenhum produto cadastrado.\n");
                            break;
                        }
                        
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Produto " + i + ":");
                            produtos[i].listar();
                            System.out.println();
                        }
                    }
                    case 3 -> {
                        if (contador == 0) {
                            System.out.println("Nenhum produto cadastrado para alterar.\n");
                            break;
                        }
                        
                        System.out.print("Digite o índice do produto a ser alterado (0 a " + (contador - 1) + "): ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (indice >= 0 && indice < contador) {
                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Novo preço: ");
                            double novoPreco = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Nova validade: ");
                            String novaValidade = scanner.nextLine();
                            System.out.print("Novo tipo: ");
                            String novoTipo = scanner.nextLine();
                            System.out.print("Nova marca: ");
                            String novaMarca = scanner.nextLine();
                            
                            produtos[indice].alterar(novoNome, novoPreco, novaValidade, novoTipo, novaMarca);
                            System.out.println("Produto alterado com sucesso!\n");
                        } else {
                            System.out.println("Índice inválido!\n");
                        }
                    }
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida! Tente novamente.\n");
                }
            } while (opcao != 0);
        }
    }
}