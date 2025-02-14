import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("O caractere é uma vogal.");
        } else {
            System.out.println("O caractere não é uma vogal.");
        }
    }
}
