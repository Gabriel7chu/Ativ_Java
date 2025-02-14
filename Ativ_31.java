import java.util.Scanner;

public class Ativ_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = scanner.nextDouble();
        System.out.print("Digite o valor do saque: R$ ");
        double saque = scanner.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}