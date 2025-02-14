import java.util.Scanner;

public class Ativ_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        double valorMinimoParaBrinde = 200; // Exemplo de valor mínimo para ganhar o brinde

        if (valorCompra >= valorMinimoParaBrinde) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("Valor insuficiente para ganhar o brinde.");
        }
    }
}