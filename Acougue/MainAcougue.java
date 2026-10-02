import java.util.Scanner;
import java.util.ArrayList;

public class MainAcougueV2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao;
        double troco = 0;
        ArrayList<ProdutoV2> menu = new ArrayList<>();
        ArrayList<ProdutoV2> carrinho = new ArrayList<>();
        double total = 0;
        double pagamento = 0;
        boolean dia = false;
        boolean cliente = false;
        double faturamentoDia = 0;
        ArrayList<FuncionarioV2> escala = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Estoque> estoque = new ArrayList<>();

        ProdutoV2 produto1 = new ProdutoV2(66, "Picanha", 60);
        ProdutoV2 produto2 = new ProdutoV2(77, "Maminha", 55);
        ProdutoV2 produto3 = new ProdutoV2(69, "Fraldinha", 70);
        ProdutoV2 produto4 = new ProdutoV2(77, "Patinho", 67);
        ProdutoV2 produto5 = new ProdutoV2(11, "Contra-Filé", 70);
        ProdutoV2 produto6 = new ProdutoV2(22, "Coxão Duro", 70);
        ProdutoV2 produto7 = new ProdutoV2(33, "Coxão Mole", 70);

        AcougueiroV2 acougueiro = new AcougueiroV2(69, "JP", "12321312112", "Acougueiro", null);
        AssistenteV2 assistente = new AssistenteV2(67, "Henrique", "123-123-123-12", "Assistente", null);
        escala.add(assistente);
        escala.add(acougueiro);

        Caixa caixa = new Caixa(10000, 0);

        menu.add(produto1);
        menu.add(produto2);
        menu.add(produto3);
        menu.add(produto4);
        menu.add(produto5);
        menu.add(produto6);
        menu.add(produto7);

        for (ProdutoV2 prod : menu) {
            estoque.add(new Estoque(prod, 50, "" + prod.getId(), "Bovino"));
        }

        do {
            System.out.println("\n- - - MENU AÇOUGUE - - -");
            System.out.println("1 - Iniciar dia");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Fazer Pedido"); 
            System.out.println("4 - Exibir Clientes");
            System.out.println("5 - Exibir Funcionários");
            System.out.println("6 - Exibir Produtos");
            System.out.println("7 - Exibir Estoque");
            System.out.println("8 - Adicionar ao estoque");
            System.out.println("9 - Definir Escala: ");
            System.out.println("0 - Finalizar dia");
            
            System.out.print("Digite Uma Opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:

                if(dia == true) {
                    System.out.println("Dia ja Iniciado!");
                } else {

                System.out.println("Iniciando o Dia...");
                assistente.abrir(caixa);
                dia = true;
                faturamentoDia = 0;
                }

                break;

                case 2:

                if ( dia == true) {

                    System.out.print("Digite o nome do cliente: ");
                    String nomeCli = ler.nextLine();

                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneCli = ler.nextLine();

                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCli = ler.nextLine();

                    System.out.print("Digite o endereço do cliente: ");
                    String enderecoCli = ler.nextLine();

                    Cliente c = new Cliente(nomeCli, telefoneCli, cpfCli, enderecoCli);
                    listaClientes.add(c);
                    cliente = true;
                    System.out.println("Cliente cadastrado com sucesso!");

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }

                break;

                case 3:

                int escolhaCli = -1;
                if ( cliente == true) {
                   if (listaClientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado.");
                            break;
                        } else {
                            System.out.println("- - - LISTA DE CLIENTES - - -");
                            int i = 0;
                            for (Cliente cli : listaClientes) {
                                i++;
                                System.out.println( i + " - Nome: " + cli.getNome() + " | CPF: " + cli.getCpf() + " | Tel: " + cli.getTelefone());
                            }
                            System.out.print("Escolha qual cliente: ");
                            escolhaCli = ler.nextInt() - 1;

                            if (escolhaCli < 0 || escolhaCli >= listaClientes.size()) {
                                System.out.println("Número inválido!");
                                break;
                            }
                        }

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("Nenhum Cliente Cadastrado.");
                }

                if (dia == true && cliente == true) {

                    carrinho.clear();
                    total = 0;
                    int opcaoProd;

                    System.out.println("\n- - - PRODUTOS - - -");
                    for (int p = 0; p < menu.size(); p++) {
                        System.out.println((p + 1) + " - " + menu.get(p).getNome() + " (R$ " + menu.get(p).getPreco() + ")");
                    }

                    do {
                        System.out.print("Insira o número do produto desejado (0 p/ parar): ");
                        opcaoProd = ler.nextInt();

                        if (opcaoProd > 0 && opcaoProd <= menu.size()) {
                            ProdutoV2 prodSelecionado = menu.get(opcaoProd - 1);
                            carrinho.add(prodSelecionado);
                            total += prodSelecionado.getPreco();
                            System.out.println(prodSelecionado.getNome() + " adicionado ao carrinho!");
                        } else if (opcaoProd != 0) {
                            System.out.println("Opção inválida!");
                        }

                    } while (opcaoProd != 0);

                    if (!carrinho.isEmpty()) {

                        acougueiro.PrepararPedido(carrinho);

                        System.out.println("Total do carrinho: R$ " + total);
                        System.out.print("Deseja incluir entrega ao pedido? (Sim/Nao): ");
                        ler.nextLine();
                        String comEntrega = ler.nextLine().trim();

                        boolean vendaConcluida = false;

                        if (comEntrega.equalsIgnoreCase("Sim")) {
                            total = total * 1.15;
                            System.out.println("Total com taxa de entrega (15%): R$ " + total);
                            System.out.print("Insira o valor pago pelo cliente: ");
                            pagamento = ler.nextDouble();

                            if (pagamento >= total) {
                                troco = pagamento - total;
                                caixa.registrarVenda(pagamento, total, troco);
                                faturamentoDia += total;
                                vendaConcluida = true;
                                System.out.println("Venda com entrega realizada!");
                                System.out.println("Troco: R$ " + troco);

                            } else {
                                System.out.println("Valor de pagamento insuficiente! Venda cancelada.");
                            }

                        } else if (comEntrega.equalsIgnoreCase("Nao")) {
                            System.out.print("Insira o valor pago pelo cliente: ");
                            pagamento = ler.nextDouble();

                            if (pagamento >= total) {
                                troco = pagamento - total;
                                caixa.registrarVenda(pagamento, total, troco);
                                faturamentoDia += total;
                                vendaConcluida = true;
                                System.out.println("Venda realizada! Troco: R$ " + troco);
                            } else {
                                System.out.println("Valor de pagamento insuficiente! Venda cancelada.");
                            }

                        } else {
                            System.out.println("Opção de entrega inválida! Venda cancelada.");
                        }

                        if (vendaConcluida) {
                            for (ProdutoV2 produto : carrinho) {
                                for (Estoque est : estoque) {
                                    if (est.getProduto().getId() == produto.getId()) {
                                        est.saidaEstoque(1); 
                                        break;
                                    }
                                }
                            }
                            System.out.println("Baixa no estoque efetuada com sucesso!");
                        }
                    } else {
                        System.out.println("Nenhum produto foi adicionado ao carrinho.");
                    }
                } else {
                    System.out.println("O dia deve ser iniciado e um cliente deve estar cadastrado para prosseguir.");
                }
                break;

                case 4:

                if ( cliente == true) {
                   if (listaClientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado.");
                        } else {
                            System.out.println("- - - LISTA DE CLIENTES - - -");
                            int i = 0;
                            for (Cliente cli : listaClientes) {
                                i++;
                                System.out.println( i + " - Nome: " + cli.getNome() + " | CPF: " + cli.getCpf() + " | Tel: " + cli.getTelefone());
                            }
                        }

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("Nenhum Cliente Cadastrado.");
                }

                break;
                case 5:

                if ( dia == true) {

                    System.out.println("- - - LISTA DE FUNCIONÁRIOS - - -");
                    System.out.println("Nome: " + assistente.getNome());
                    System.out.println("CPF: " + assistente.getCpf());
                    System.out.println("ID: " + assistente.getId());
                    System.out.println("Cargo: " + assistente.getCargo());
                    if (assistente.getEscala() != null) {

                        assistente.exibirEscala(assistente.getEscala());
                    } else {
                        System.out.println("Escala: Nao definida");
                    }

                    System.out.println("--------------------");
                    System.out.println("Nome: " + acougueiro.getNome());
                    System.out.println("CPF: " + acougueiro.getCpf());
                    System.out.println("ID: " + acougueiro.getId());
                    System.out.println("Cargo: " + acougueiro.getCargo());
                    if (acougueiro.getEscala() != null) {

                        acougueiro.exibirEscala(acougueiro.getEscala());
                    } else {
                        System.out.println("Escala: Nao definida");
                    }

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }

                break;
                case 6:

                if ( dia == true) {
                    System.out.println("- - - LISTA DE PRODUTOS - - -");
                    for (ProdutoV2 prod : menu) {
                        System.out.println("ID: " + prod.getId() + " | Nome: " + prod.getNome() + " | Preço: R$ " + prod.getPreco());
                    }

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }

                break;
                case 7:

                if ( dia == true) {
                    System.out.println("- - - ESTOQUE ATUAL - - -");
                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum item cadastrado no estoque.");
                    } else {
                        for (Estoque est : estoque) {
                            System.out.println("Código Registro: " + est.getCodigoRegistro() + " | Produto: " + est.getProduto().getNome() + " | Quantidade: " + est.getQntdAtual() + " | Classe: " + est.getClasse());
                        }
                    }

                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }

                break;
                case 8:

                if ( dia == true) {
                    System.out.println("- - - ADICIONAR AO ESTOQUE - - -");
                    System.out.println("Selecione o produto para dar entrada no estoque:");
                    for (int i = 0; i < estoque.size(); i++) {
                        System.out.println((i + 1) + " - " + estoque.get(i).getProduto().getNome() + " (Qtd atual: " + estoque.get(i).getQntdAtual() + ")");
                    }
                    System.out.print("Escolha o número do produto: ");
                    int escolhaEst = ler.nextInt();
                    ler.nextLine();

                    if (escolhaEst > 0 && escolhaEst <= estoque.size()) {
                        System.out.print("Digite a quantidade a ser adicionada: ");
                        double qtdAdicionar = ler.nextDouble();
                        estoque.get(escolhaEst - 1).entradaEstoque(qtdAdicionar);
                        System.out.println("Estoque atualizado com sucesso!");
                    } else {
                        System.out.println("Produto inválido!");
                    }
                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }

                break;
                case 9: 

                if ( dia == true) {
                
                    int i;
                    System.out.println("Qual funcionario voce deseja definir a escala: ");
                    System.out.println("1 - " + escala.get(0).getNome() + "\n" + "2 - " + escala.get(1).getNome());
                    System.out.print("Digite uma opção(0 p/ voltar): ");
                    i = ler.nextInt();
                    ler.nextLine();

                    switch(i) {
                        case 1:

                        System.out.print("Digite os dias de trabalho (ex.:Segunda a Sexta): ");
                        String diasAssistente = ler.nextLine();

                        System.out.print("Digite o horário de entrada (ex.: 06:00): ");
                        String horaEntradaAssistente = ler.nextLine();

                        System.out.print("Digite o horário de saída (ex.: 16:00): ");
                        String horaSaidaAssistente = ler.nextLine();

                        Escala escalaAssistente = new Escala(diasAssistente, horaEntradaAssistente, horaSaidaAssistente);
                        escala.get(0).setEscala(escalaAssistente);
                        System.out.println("Escala definida para " + escala.get(0).getNome() + " com sucesso!");

                        break;

                        case 2:

                        System.out.print("Digite os dias de trabalho (ex.:Segunda a Sexta): ");
                        String diasAcougueiro = ler.nextLine();

                        System.out.print("Digite o horário de entrada (ex.: 06:00): ");
                        String horaEntradaAcougueiro = ler.nextLine();

                        System.out.print("Digite o horário de saída (ex.: 16:00): ");
                        String horaSaidaAcougueiro = ler.nextLine();

                        Escala escalaAcougueiro = new Escala(diasAcougueiro, horaEntradaAcougueiro, horaSaidaAcougueiro);
                        escala.get(1).setEscala(escalaAcougueiro);
                        System.out.println("Escala definida para " + escala.get(1).getNome() + " com sucesso!");

                        break;

                        case 0:
                        System.out.println("Voltando...");

                        break;

                        default:
                        System.out.println("Opção Inválida");
                    }
                } else {
                    System.out.println("Opção Inválida!");
                    System.out.println("O dia deve ser iniciado antes.");
                }
                 
                    break;

                case 0:

                System.out.println("Faturamento do Dia: R$ " + faturamentoDia);
                System.out.println("Dia Finalizado!");
                    
                break;

                default:

                    System.out.println("Opção Inválida!");
                    break;
                    
            }
        } while(opcao != 0);

        ler.close();
    }
}