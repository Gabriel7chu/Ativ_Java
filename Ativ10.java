import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo de 100 a 200.");
        }
    }
}
