import java.util.Scanner;

public class Ativ_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 'Sim' ou 'Não': ");
        String palavra = scanner.nextLine().trim();

        if (palavra.equalsIgnoreCase("Sim")) {
            System.out.println("Você digitou: Sim");
        } else if (palavra.equalsIgnoreCase("Não")) {
            System.out.println("Você digitou: Não");
        } else {
            System.out.println("Entrada inválida.");
        }
    }
}