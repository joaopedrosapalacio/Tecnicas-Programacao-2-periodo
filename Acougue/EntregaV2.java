public class EntregaV2 {

    private String status = "Pendente";

    public void CalculoTaxa(double total, double pagamento) {
        double taxa = total * 1.15;
        System.out.println("O total com entrega ficou: " + taxa);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
