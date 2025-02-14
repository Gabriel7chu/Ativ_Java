import java.util.Scanner;

public class Ativ_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println(numero1 + " é divisível por " + numero2);
        } else if (numero2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            System.out.println(numero1 + " não é divisível por " + numero2);
        }
    }
}
