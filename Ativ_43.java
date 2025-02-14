import java.util.Scanner;

public class Ativ_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 7; // Número secreto
        System.out.print("Tente adivinhar o número secreto (entre 1 e 10): ");
        int palpite = scanner.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o número secreto.");
        } else {
            System.out.println("Tente novamente! O número secreto era: " + numeroSecreto);
        }
    }
}