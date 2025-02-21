import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // sistema sesi
        System.out.println("Bem vindo ao portal escolar SESI!");
        String nome;
        int nota;

        System.out.println("Qual é seu nome?");
        nome = input.nextLine();
        System.out.println("Informe sua nota");
        nota = input.nextInt();

        // processamento
        if (nota >= 50) {

            // saida se a nota media for maior que 50
            System.out.println("Parabéns, você foi aprovado(a)");
        } else {

            // saida se a nota media for menor que 50
            System.out.println("Você foi reprovado!");
        }
    }
}
