public class Robo {

    private int codigo;
    private String nome;
    private String tipo;
    private int bateria;
    private boolean ativo;

    public Robo(boolean ativo, int bateria, int codigo, String nome, String tipo) {
        this.ativo = ativo;
        this.setBateria(bateria);
        this.setCodigo(codigo);
        this.setNome(nome);
        this.tipo = tipo;
    }

    public Robo(int codigo, String nome, String tipo) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("Codigo invalido, coloque um numero positivo");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty() && !nome.isBlank()){
            this.nome = nome;
        } else {
            System.out.println("O nome nao pode ser nulo");
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Bateria invalida");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ligar() {
        if (bateria < 15) {
            System.out.println("Nao e possivel ligar o robo.");
            System.out.println("Bateria insuficiente.");
            ativo = false;
        } else {
            System.out.println("Ligando o robo.");
            ativo = true;
        }
    }

    public void desligar() {
        System.out.println("Desligando o robo.");
        ativo = false;
    }

    public void recarregar() {
        bateria = 100;
    }

    public void consumirBateria(int percentual) {
        bateria -= percentual;

        if (bateria < 0) {
            System.out.println("Impossivel consumir mais bateria.");
            System.out.println("Bateria em 0%");
        }
    }

    public void exibirDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Status: " + this.ativo);
    }
}