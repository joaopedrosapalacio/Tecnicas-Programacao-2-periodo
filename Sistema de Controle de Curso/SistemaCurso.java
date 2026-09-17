public class SistemaCurso {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno (
            "Joao",
            1111,
            17,
            "joao@gmail.com"
        );

        aluno.exibirDados();
        aluno.verificarMaioridade();

        Aluno aluno2 = new Aluno (
            "Maria",
            2222,
            24,
            "maria@gmail.com"
        );

        aluno2.exibirDados();
        aluno2.verificarMaioridade();

        Curso curso = new Curso (
            3600,
            "Engenharia De Software",
            1000
        );

        curso.exibirDados();
        curso.calcularValorPorHora(curso.getValor(), curso.getCargaHoraria());
        curso.validarCurso();

        Curso curso2 = new Curso ();

        curso2.exibirDados();
        curso2.calcularValorPorHora(curso.getValor(), curso.getCargaHoraria());
        curso2.validarCurso();

    }
}