import java.util.Scanner;

public class Ativ_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
