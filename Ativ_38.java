import java.util.Scanner;

public class Ativ_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        boolean valido = false;

        // Verificando os meses com 31 dias
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 1 && dia <= 31) {
                valido = true;
            }
        }
        // Verificando os meses com 30 dias
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                valido = true;
            }
        }
        // Verificando o mês de fevereiro
        else if (mes == 2) {
            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();
            // Verificação para ano bissexto
            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            if (bissexto && dia >= 1 && dia <= 29) {
                valido = true;
            } else if (!bissexto && dia >= 1 && dia <= 28) {
                valido = true;
            }
        }

        if (valido) {
            System.out.println("Dia válido.");
        } else {
            System.out.println("Dia inválido.");
        }
    }
}
