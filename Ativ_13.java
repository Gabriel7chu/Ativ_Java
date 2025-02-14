import java.util.Scanner;

public class Ativ_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double maior = nota1;
        double menor = nota1;

        if (nota2 > maior) maior = nota2;
        if (nota3 > maior) maior = nota3;

        if (nota2 < menor) menor = nota2;
        if (nota3 < menor) menor = nota3;

        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
    }
}