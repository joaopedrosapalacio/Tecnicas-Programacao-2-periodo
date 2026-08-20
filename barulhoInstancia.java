public class barulhoInstancia {
    public static void main(String[] args) {
        Barulho b1 = new Barulho();
        b1.incomodo = true;
        b1.alto = true;
        b1.valorEmDecibels = 85.0;
        b1.status();
        b1.buzinar();
        b1.gritar();

        System.out.println("--------------------------------");

        Barulho b2 = new Barulho();
        b2.incomodo = false;
        b2.alto = true;
        b2.valorEmDecibels = 90.0;
        b2.status();
        b2.buzinar();
        b2.gritar();

    }
}
