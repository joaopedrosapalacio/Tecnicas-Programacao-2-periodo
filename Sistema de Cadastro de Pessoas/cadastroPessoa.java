public class cadastroPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        // 1. Criacao de uma pessoa utilizando o construtor padrao
        p1.setId(1);

        // 2. Criacao de uma pessoa utilizando construtor parametrizado
        Pessoa p2 = new Pessoa("529.982.247-25", "carlos@email.com", 2, "Carlos Souza", "551198765432");

        // 3. Cadastro de um CPF valido
        p1.setCpf("52998224725");

        // 4. Tentativa de cadastro de um CPF invalido
        p1.setCpf("123.456.789-00");

        // 5. Tentativa de cadastro de nome vazio
        p1.setNome("   ");
        p1.setNome("Ana Silva");

        // 6. Tentativa de cadastro de e-mail invalido
        p1.setEmail("anasilvaemailcom");

        // 7. Utilizacao do metodo sobrecarregado
        p1.atualizarContato("ana.silva@email.com");
        p2.atualizarContato("carlos.novo@email.com", "5521999998888");

        // 8. Exibicao dos dados cadastrados
        System.out.println("--- DADOS DA PESSOA 1 ---");
        p1.exibirDados();

        System.out.println("\n--- DADOS DA PESSOA 2 ---");
        p2.exibirDados();
    }
}