import java.util.Scanner;

public class Ativ_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o valor da parcela: R$ ");
        double parcela = scanner.nextDouble();

        if (parcela <= salario * 0.10) {
            System.out.println("Você pode comprar o produto parcelado.");
        } else {
            System.out.println("A parcela excede 10% do seu salário. Você não pode comprar o produto parcelado.");
        }
    }
}
