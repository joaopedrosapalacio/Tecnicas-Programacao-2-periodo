import java.util.Scanner;

public class funcionarioInstancia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Funcionario[] funcionarios = new Funcionario[10];
            int contador = 0;
            int opcao;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar funcionario");
                System.out.println("2 - Listar funcionarios");
                System.out.println("3 - Alterar uma informacao de um funcionario");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opcao: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> {
                        if (contador >= funcionarios.length) {
                            System.out.println("Limite maximo de 10 funcionarios atingido!");
                            break;
                        }

                        System.out.print("Digite a matricula: ");
                        int matricula = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o cargo: ");
                        String cargo = scanner.nextLine();

                        System.out.print("Digite o salario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        funcionarios[contador] = new Funcionario(matricula, nome, cargo, salario);
                        contador++;
                        System.out.println("Funcionario cadastrado com sucesso!");
                    }

                    case 2 -> {
                        if (contador == 0) {
                            System.out.println("Nenhum funcionario cadastrado.");
                            break;
                        }

                        System.out.println("\n--- Lista de Funcionarios ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.print("Indice [" + i + "] -> ");
                            funcionarios[i].listar();
                        }
                    }

                    case 3 -> {
                        if (contador == 0) {
                            System.out.println("Nenhum funcionario cadastrado para alterar.");
                            break;
                        }

                        System.out.print("Digite o indice do funcionario (0 a " + (contador - 1) + "): ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 0 && indice < contador) {
                            System.out.println("\nQual informacao deseja alterar?");
                            System.out.println("1 - Nome");
                            System.out.println("2 - Cargo");
                            System.out.println("3 - Salario");
                            System.out.print("Opcao: ");
                            int campo = scanner.nextInt();
                            scanner.nextLine();

                            switch (campo) {
                                case 1 -> {
                                    System.out.print("Novo nome: ");
                                    funcionarios[indice].setNome(scanner.nextLine());
                                    System.out.println("Nome atualizado!");
                                }
                                case 2 -> {
                                    System.out.print("Novo cargo: ");
                                    funcionarios[indice].setCargo(scanner.nextLine());
                                    System.out.println("Cargo atualizado!");
                                }
                                case 3 -> {
                                    System.out.print("Novo salario: ");
                                    funcionarios[indice].setSalario(scanner.nextDouble());
                                    scanner.nextLine();
                                    System.out.println("Salario atualizado!");
                                }
                                default -> System.out.println("Opcao de alteracao invalida.");
                            }
                        } else {
                            System.out.println("Indice invalido!");
                        }
                    }

                    case 0 -> System.out.println("Saindo do sistema...");

                    default -> System.out.println("Opcao invalida! Tente novamente.");
                }
            } while (opcao != 0);
        }
    }
}