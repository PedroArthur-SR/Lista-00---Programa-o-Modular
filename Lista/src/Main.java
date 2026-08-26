import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        double[][] matriz = new double[12][4];
        double totalAno = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("-------- TOTAL POR MÊS ---------");
        for (int i = 0; i < matriz.length; i++) {
            double somaMes = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                somaMes += matriz[i][j];
                totalAno += matriz[i][j];
            }
            System.out.println("A soma total do mês "+meses[i]+" foi de R$"+somaMes );
        }
        System.out.println("\n-------- TOTAL POR SEMANA NO ANO ---------");
        for (int j = 0; j < 4; j++){
            double totalSemana = 0;
            for (int i = 0; i < 12; i++) {
                totalSemana += matriz[i][j];
            }
            System.out.println("Total vendido na semana "+(j + 1)+" no ano: R$"+String.format("%.2f", totalSemana));
        }
        System.out.println("\n--------TOTAL ANO---------");
        System.out.println("O total vendido no ano foi de R$"+totalAno);
    }
}