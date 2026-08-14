import java.util.Scanner;
public class Main{
    static void main() {
        Scanner entrada = new Scanner(System.in);
        char[] gabarito = new char[8];
        int aprovados = 0;
        for (int i = 0; i < 8; i++) {
            gabarito[i] = entrada.next().charAt(0);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número do aluno:");
            int numeroAluno = entrada.nextInt();
            int nota = 0;
            System.out.println("Digite as 8 respostas do aluno:");
            for (int j = 0; j < 8; j++) {
                char resposta = entrada.next().charAt(0);
                if (resposta == gabarito[j]) {
                    nota++;
                }
            }

            System.out.println("Aluno " + numeroAluno + " - Nota: " + nota);

            if (nota >= 6) {
                aprovados++;
            }
        }
        double porcentagem = (aprovados / 10.0) * 100;
        System.out.println("Porcentagem de aprovação: " + porcentagem + "%");
    }
}