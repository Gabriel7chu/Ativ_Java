import java.util.Scanner;

public class Ativ_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoAcessoCorreto = 1234; // código correto
        System.out.print("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();

        if (codigoAcesso == codigoAcessoCorreto) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Código de acesso inválido.");
        }
    }
}