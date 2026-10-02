public class Onibus {
    
    private String placa;
    private String modelo;
    private int capacidadeSentados;
    private int capacidadeEmPe;
    private int qtdSentadosOcupados;
    private int qtdEmPeOcupados;

    public Onibus(int capacidadeEmPe, int capacidadeSentados, String modelo, String placa) {
        this.capacidadeEmPe = capacidadeEmPe;
        this.capacidadeSentados = capacidadeSentados;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeSentados() {
        return capacidadeSentados;
    }

    public void setCapacidadeSentados(int capacidadeSentados) {
        this.capacidadeSentados = capacidadeSentados;
    }

    public int getCapacidadeEmPe() {
        return capacidadeEmPe;
    }

    public void setCapacidadeEmPe(int capacidadeEmPe) {
        this.capacidadeEmPe = capacidadeEmPe;
    }

    public int getQtdSentadosOcupados() {
        return qtdSentadosOcupados;
    }

    public void setQtdSentadosOcupados(int qtdSentadosOcupados) {
        if (qtdSentadosOcupados < 0) {
            System.out.println("O numero de pessoas sentadas nao pode ser negativo");
        } else {
            this.qtdSentadosOcupados = qtdSentadosOcupados;
        }
    }

    public int getQtdEmPeOcupados() {
        return qtdEmPeOcupados;
    }

    public void setQtdEmPeOcupados(int qtdEmPeOcupados) {
        if (qtdEmPeOcupados < 0) {
            System.out.println("O numero de pessoas em pe nao pode ser negativo");
        } else {
            this.qtdEmPeOcupados = qtdEmPeOcupados;
        }
    }

    public boolean embarcarPassageiro(boolean sentado){
        if (qtdEmPeOcupados > capacidadeEmPe || qtdSentadosOcupados > capacidadeSentados) {
            System.out.println("Capacidade maxima de acentos ocupados atingida");
            return sentado = false;
        } else {
            return sentado = true;
        }
    }

    public boolean desembarquePassageiro(boolean sentado) {
        return sentado = false;
    }
}
