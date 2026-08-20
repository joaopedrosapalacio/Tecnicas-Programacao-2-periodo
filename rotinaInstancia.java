public class rotinaInstancia {
    public static void main(String[] args) {
        Rotina r1 = new Rotina();
        r1.definirRotina("Escritório", "Trabalhar", 9.0);
        r1.status();
        r1.realizarAcao();

        System.out.println("--------------------------------");

        Rotina r2 = new Rotina();
        r2.definirRotina("Academia", "Exercitar", 18.0);
        r2.status();
        r2.realizarAcao();
        
    }
}
