public class cadastroFornecedor {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();

        // 1. Criacao de um fornecedor utilizando o construtor padrao
        f1.setCodigo(101);

        // 2. Criacao de um fornecedor utilizando construtor parametrizado
        Fornecedor f2 = new Fornecedor(
            102, 
            "TechMais Equipamentos LTDA", 
            "TechMais", 
            "12.345.678/0001-95", 
            "contato@techmais.com", 
            "551198765432"
        );

        // 3. Cadastro de um CNPJ valido (sem pontuacao)
        f1.setCnpj("12345678000195");

        // 4. Tentativa de cadastro de um CNPJ invalido
        f1.setCnpj("11.111.111/1111-11");

        // 5. Tentativa de cadastro de razao social vazia
        f1.setRazaoSocial("   ");
        f1.setRazaoSocial("ABC Manutencao de Softwares LTDA");
        f1.setNomeFantasia("ABC Softwares");

        // 6. Tentativa de cadastro de e-mail invalido
        f1.setEmail("email_sem_arroba.com");

        // 7. Utilizacao do metodo sobrecarregado
        f1.atualizarContato("suporte@abcsoftwares.com");
        f2.atualizarContato("vendas@techmais.com", "5521999998888");

        // 8. Exibicao dos dados cadastrados
        f1.exibirDados(true);
        f2.exibirDados(false);
    }
}