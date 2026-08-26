import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        char[] equipes = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'
        };
        while (equipes.length > 1) {
            char[] vencedores = new char[equipes.length / 2];
            for (int i = 0; i < equipes.length; i += 2) {
                int M = entrada.nextInt();
                int N = entrada.nextInt();
                int indiceVencedor = i / 2;

                if (M > N) {
                    vencedores[indiceVencedor] = equipes[i];
                } else {
                    vencedores[indiceVencedor] = equipes[i + 1];
                }
            }
            equipes = vencedores;
        }
        System.out.println(equipes[0]);
    }
}