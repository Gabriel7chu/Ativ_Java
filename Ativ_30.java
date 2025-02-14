import java.util.Scanner;

public class Ativ_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura <= 15) {
            System.out.println("Está frio");
        } else if (temperatura > 15 && temperatura <= 25) {
            System.out.println("Está agradável");
        } else {
            System.out.println("Está quente");
        }
    }
}
