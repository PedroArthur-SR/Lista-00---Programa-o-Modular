import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[6];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite os 6 números: ");
            vetor[i] = entrada.nextInt();
        }
        int somaPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                System.out.println("Número: "+vetor[i]+ " na posição "+(i + 1));
                somaPares += vetor[i];
            }
        }
        System.out.println("A soma dos pares é: "+somaPares);
        int qtdImpares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0){
                System.out.println("Número: "+vetor[i]+ " na posição "+(i + 1));
                qtdImpares ++;
            }
        }
        System.out.println("Quantidade de ímpares:"+qtdImpares);
    }
}