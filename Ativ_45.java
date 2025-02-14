import java.util.Random;
import java.util.Scanner;

public class Ativ_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1; // Número sorteado entre 1 e 10

        System.out.print("Digite um número entre 1 e 10: ");
        int palpite = scanner.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número sorteado.");
        } else {
            System.out.println("Você errou. O número sorteado era: " + numeroSorteado);
        }
    }
}