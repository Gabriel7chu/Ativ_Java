import java.util.Scanner;

public class Ativ_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int diferenca = numero1 - numero2;

        if (diferenca < 0) {
            System.out.println("A diferença é negativa.");
        } else {
            System.out.println("A diferença não é negativa.");
        }
    }
}