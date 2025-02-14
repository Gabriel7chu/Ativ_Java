import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 5.");
        }
    }
}
