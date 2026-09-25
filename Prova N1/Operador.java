public class Operador {

    private int codigo;
    private String nome;
    private String nivel;

    public Operador(int codigo, String nivel, String nome) {
        this.setCodigo(codigo);
        this.nivel = nivel;
        this.setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            System.out.println("Codigo invalido");
        } else {
        this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome nao pode ser nulo");
        }
        
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nivel: " + this.nivel);
    }

    public void controlar(Robo robo) {
        System.out.println("Operador: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println();
        System.out.println("Robo Controlado:");
        System.out.println("Nome: " + robo.getNome());
        System.out.println("Tipo: " + robo.getTipo());
        System.out.println("Bateria: " + robo.getBateria());
    }
}