import java.util.Scanner;

public class Ativ_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da disciplina: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            if (nota == 10) {
                System.out.println("Aluno aprovado com nota máxima!");
            } else {
                System.out.println("Aluno aprovado.");
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
