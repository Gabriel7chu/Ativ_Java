import java.util.Scanner;

public class Ativ_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a pressão arterial sistólica: ");
        int sistolica = scanner.nextInt();
        System.out.print("Digite a pressão arterial diastólica: ");
        int diastolica = scanner.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão arterial normal");
        } else if (sistolica >= 120 && sistolica < 140 || diastolica >= 80 && diastolica < 90) {
            System.out.println("Pressão arterial moderada");
        } else {
            System.out.println("Pressão arterial alta");
        }
    }
}
