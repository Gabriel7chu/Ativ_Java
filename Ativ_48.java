import java.util.Scanner;

public class Ativ_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Escolha a conversão: ");
        System.out.println("1. Para Fahrenheit");
        System.out.println("2. Para Kelvin");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C equivale a " + fahrenheit + "°F.");
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + "°C equivale a " + kelvin + " K.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
