import java.util.Scanner;

public class Ativ_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        if (soma > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma não é maior que 100.");
        }
    }
}