import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("O número está dentro do intervalo de 10 a 50.");
        } else {
            System.out.println("O número não está dentro do intervalo de 10 a 50.");
        }
    }
}
