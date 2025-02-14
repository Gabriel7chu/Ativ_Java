import java.util.Scanner;

public class Ativ_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > 2 * num2) {
            System.out.println("O primeiro número é maior que o dobro do segundo.");
        } else if (num2 > 2 * num1) {
            System.out.println("O segundo número é maior que o dobro do primeiro.");
        } else {
            System.out.println("Nenhum número é maior que o dobro do outro.");
        }
    }
}
