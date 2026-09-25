import java.util.InputMismatchException;
import java.util.Scanner;

public class sistemaRobo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robo robo = null;
        Operador operador = new Operador(1, "Padrao", "Operador Padrao");
        Laboratorio laboratorio = new Laboratorio("Laboratorio Principal");
        int opcao = 0;

        do {

            try {
                System.out.println("====================================");
                System.out.println("LABORATORIO DE ROBOTICO");
                System.out.println("====================================");
                System.out.println();
                System.out.println("1 - Cadastrar robo");
                System.out.println("2 - Listar robos");
                System.out.println("3 - Buscar robo");
                System.out.println("4 - Ligar robo");
                System.out.println("5 - Desligar robo");
                System.out.println("6 - Recarregar robo");
                System.out.println("7 - Controlar robo");
                System.out.println("8 - Exibir quantidade de robos ativos");
                System.out.println("0 - Sair");
                System.out.println();
                System.out.println("Digite uma opcao: ");
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcao invalida, digite apenas numeros");
                opcao = -1;
            } finally {
                System.out.println("Operacao finalizada");
                scanner.nextLine();
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome do robo");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o codigo do robo");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o tipo do robo");
                    String tipo = scanner.nextLine();
                    System.out.println("Digite a bateria do robo");
                    int bateria = scanner.nextInt();
                    scanner.nextLine();

                    robo = new Robo(codigo, nome, tipo);
                    robo.setBateria(bateria);
                    laboratorio.adicionarRobo(robo);
                }
                case 2 -> laboratorio.listarRobos();
                case 3 -> {
                    System.out.println("Digite um codigo para a busca");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine();
                    laboratorio.buscarRobo(codigoBusca);
                }
                case 4 -> robo.ligar();
                case 5 -> robo.desligar();
                case 6 -> robo.recarregar();
                case 7 -> operador.controlar(robo);
                case 8 -> laboratorio.contarRobosAtivos();
                default -> System.out.println("Digite uma opcao valida");
            }

        } while (opcao != 0);
    }
}