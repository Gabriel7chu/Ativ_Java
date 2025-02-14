import java.util.Scanner;

public class Ativ_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = scanner.nextDouble();

        if (salario >= 3000) {
            System.out.println("Você pode financiar o imóvel.");
        } else {
            System.out.println("Você não pode financiar o imóvel.");
        }
    }
}
