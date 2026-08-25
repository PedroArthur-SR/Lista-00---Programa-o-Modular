import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double[] valorPrecos = new double[10];
        int[] qtdPecas = new int[10];
        for (int i = 0; i < valorPrecos.length; i++) {
            System.out.println("Informe o preço do objeto: ");
            valorPrecos[i] = entrada.nextDouble();
            System.out.println("Informe a quantidade de objetos: ");
            qtdPecas[i] = entrada.nextInt();
        }
        double valorGeralVendas = 0;
        int maiorQtd = 0;
        int posicaoMaisVendido = 0;

        for (int i = 0; i < 10; i++) {
            double valorTotalObjeto = valorPrecos[i] * qtdPecas[i];
            valorGeralVendas += valorTotalObjeto;
            System.out.println("Objeto "+ (i + 1) +
            " | Qtd: "+qtdPecas[i] +
                    " | Valor Unitário: R$ " + valorPrecos[i] +
                    " | Total: R$ " + valorTotalObjeto);
            if (qtdPecas[i] > maiorQtd){
                maiorQtd = qtdPecas[i];
                posicaoMaisVendido = i;
            }
        }
        double comissao = valorGeralVendas * 0.05;

        System.out.println("----------------------------------");
        System.out.println("Valor geral das vendas: R$ " + valorGeralVendas);
        System.out.println("Valor da comissão (5%): R$ " + comissao);
        System.out.println("Objeto mais vendido: Posição " + posicaoMaisVendido +
                " (Preço: R$ " + valorPrecos[posicaoMaisVendido] + ")");
    }
}