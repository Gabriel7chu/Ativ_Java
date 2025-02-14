import java.util.Scanner;

public class Ativ_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o período
        int anoInicio = 2025;
        int mesInicio = 1; // Janeiro
        int diaInicio = 1;
        int anoFim = 2025;
        int mesFim = 12; // Dezembro
        int diaFim = 31;

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        boolean dentroDoPeriodo = false;

        if (ano > anoInicio && ano < anoFim) {
            dentroDoPeriodo = true;
        } else if (ano == anoInicio && mes >= mesInicio && dia >= diaInicio) {
            dentroDoPeriodo = true;
        } else if (ano == anoFim && mes <= mesFim && dia <= diaFim) {
            dentroDoPeriodo = true;
        }

        if (dentroDoPeriodo) {
            System.out.println("A data está dentro do período.");
        } else {
            System.out.println("A data não está dentro do período.");
        }
    }
}
