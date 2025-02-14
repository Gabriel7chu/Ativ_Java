import java.util.Scanner;

public class Ativ_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra > 500) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Você recebeu um desconto de 10%.");
            System.out.println("Valor com desconto: R$ " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
        }
    }
}