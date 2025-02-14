import java.util.Scanner;

public class Ativ_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine().trim();

        if (nome.toUpperCase().startsWith("A")) {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome não começa com a letra 'A'.");
        }
    }
}