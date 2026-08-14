import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double[] temperaturas = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura média de " + meses[i] + ":");
            temperaturas[i] = entrada.nextDouble();
        }
        double maiorTemp = temperaturas[0];
        int posMaior = 0;

        double menorTemp = temperaturas[0];
        int posMenor = 0;
        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maiorTemp) {
                maiorTemp = temperaturas[i];
                posMaior = i;
            }
            if (temperaturas[i] < menorTemp) {
                menorTemp = temperaturas[i];
                posMenor = i;
            }
        }
        System.out.println("\nMaior temperatura: " + maiorTemp + "°C em " + meses[posMaior]);
        System.out.println("Menor temperatura: " + menorTemp + "°C em " + meses[posMenor]);
    }
}