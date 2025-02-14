import java.util.Scanner;

public class Ativ_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora >= 0 && hora < 12) {
            System.out.println("Período: Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Período: Tarde");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Período: Noite");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}
