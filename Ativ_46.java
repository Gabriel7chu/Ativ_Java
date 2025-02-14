import java.util.Scanner;

public class Ativ_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa do veículo (último número): ");
        int ultimoNumeroPlaca = scanner.nextInt();

        if (ultimoNumeroPlaca % 2 == 0) {
            System.out.println("O veículo pode passar no pedágio (placa terminada em número par).");
        } else {
            System.out.println("O veículo não pode passar no pedágio (placa terminada em número ímpar).");
        }
    }
}

