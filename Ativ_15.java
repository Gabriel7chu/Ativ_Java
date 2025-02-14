import java.util.Scanner;

public class Ativ_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = scanner.nextDouble();

        if (nota1 >= 7 && nota2 >= 7) {
            System.out.println("Aluno aprovado nas duas disciplinas.");
        } else {
            System.out.println("Aluno não aprovado em ambas as disciplinas.");
        }
    }
}