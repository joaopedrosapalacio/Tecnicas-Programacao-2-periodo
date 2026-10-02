public class mainDispositivoEletronico {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(100, "Lg");
        Televisao tv = new Televisao(300, "Samsung");

        ar.calcularConsumoDiario(4);
        tv.calcularConsumoDiario(8);
    }
}
