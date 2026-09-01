import java.util.Scanner;

public class posto {
    public static void main(String[] args) {

        BombaCombustivel bombaGasolina = new BombaCombustivel("Gasolina Comum", 1000.0, 200.0, 5.80);
        CaixaPosto caixa = new CaixaPosto();
        
        Scanner ler = new Scanner(System.in);

        System.out.println("=== SISTEMA INTEGRADO DE POSTO ===");
        System.out.println("Combustivel Disponivel: " + bombaGasolina.getTipoCombustivel());
        System.out.println("Preco por Litro: " + bombaGasolina.getPrecoPorLitro());
        System.out.println("Estoque Atual do Tanque: " + bombaGasolina.getEstoqueAtualLitros() + "L");
        System.out.println("==================================\n");

        System.out.print("Digite quantos litros deseja abastecer: ");
        double litros = ler.nextDouble();

        System.out.print("Digite o valor em dinheiro entregue pelo cliente: ");
        double dinheiro = ler.nextDouble();
        System.out.println();

        caixa.realizarAbastecimentoPorLitro(bombaGasolina, litros, dinheiro);

        System.out.println("=== CONFERENCIA FINAL ===");
        System.out.println("Estoque Final na Bomba: " + bombaGasolina.getEstoqueAtualLitros() + "L");
        System.out.println("=========================");

    }
}
