import java.util.Scanner;

public class Ativ_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
