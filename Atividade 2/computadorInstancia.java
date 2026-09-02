import java.util.Scanner;

public class computadorInstancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computador comp = null;
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar computador");
            System.out.println("2 - Exibir computador");
            System.out.println("3 - Alterar uma informação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o número de série: ");
                    String numeroSerie = scanner.nextLine();
                    System.out.print("Digite o defeito relatado: ");
                    String defeito = scanner.nextLine();
                    
                    comp = new Computador(marca, modelo, numeroSerie, defeito);
                    System.out.println("Computador cadastrado com sucesso!\n");
                }
                case 2 -> {
                    if (comp == null) {
                        System.out.println("Nenhum computador cadastrado no sistema.\n");
                    } else {
                        System.out.println("\n--- Dados do Computador ---");
                        System.out.println("Marca: " + comp.getMarca());
                        System.out.println("Modelo: " + comp.getModelo());
                        System.out.println("Nº de Série: " + comp.getNumeroSerie());
                        System.out.println("Defeito: " + comp.getDefeito() + "\n");
                    }
                }
                case 3 -> {
                    if (comp == null) {
                        System.out.println("Nenhum computador cadastrado para alterar.\n");
                    } else {
                        System.out.println("O que deseja alterar?");
                        System.out.println("1 - Marca | 2 - Modelo | 3 - Nº Série | 4 - Defeito");
                        int subOpcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (subOpcao) {
                            case 1 -> {
                                System.out.print("Nova Marca: ");
                                comp.setMarca(scanner.nextLine());
                            }
                            case 2 -> {
                                System.out.print("Novo Modelo: ");
                                comp.setModelo(scanner.nextLine());
                            }
                            case 3 -> {
                                System.out.print("Novo Nº Série: ");
                                comp.setNumeroSerie(scanner.nextLine());
                            }
                            case 4 -> {
                                System.out.print("Novo Defeito: ");
                                comp.setDefeito(scanner.nextLine());
                            }
                            default -> System.out.println("Opção inválida.");
                        }
                        System.out.println("Informação atualizada com sucesso!\n");
                    }
                }
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 0);
    }
}
