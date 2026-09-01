public class Talho {

    private int idTalho;
    private String cultura;
    private double areaHectares;
    private double nivelInfestacao;

    public Talho(int idTalho, String cultura, double areaHectares, double nivelInfestacao) {
        this.areaHectares = areaHectares;
        this.cultura = cultura;
        this.idTalho = idTalho;
        this.nivelInfestacao = nivelInfestacao;
    }

    public int getIdTalho() {
        return idTalho;
    }

    public void setIdTalho(int idTalho) {
        this.idTalho = idTalho;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public double getAreaHectares() {
        return areaHectares;
    }

    public void setAreaHectares(double areaHectares) {
        this.areaHectares = areaHectares;
    }

    public double getNivelInfestacao() {
        return nivelInfestacao;
    }

    public void setNivelInfestacao(double nivelInfestacao) {
        if (nivelInfestacao < 0.0 || nivelInfestacao > 100.0) {
            System.out.println("Nível de infestação deve estar entre 0 e 100.");
        } else {
            this.nivelInfestacao = nivelInfestacao;
        }
    } 
}