import java.util.Scanner;
public class Main{
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = {entrada.nextInt(), entrada.nextInt(), entrada.nextInt()};
        int maior = vetor[0];
        int menor = vetor[0];
        int x = vetor[0];
        int y = vetor[1];
        int z = vetor[2];
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior){
                maior = vetor[i];
            }if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        if ((x >= y && x <= z) || (x >= z && x <= y)) {
            System.out.println("O número X (" + x + ") ESTÁ DENTRO do intervalo");
        } else {
            System.out.println("O número X (" + x + ") ESTÁ FORA do intervalo");
        }
        if (y != 0 && x % y == 0) {
            System.out.println("X (" + x + ") é divisível por Y (" + y + ")");
        } else {
            System.out.println("X (" + x + ") NÃO é divisível por Y (" + y + ")");
        }
        if (z != 0 && x % z == 0) {
            System.out.println("X (" + x + ") é divisível por Z (" + z + ")");
        } else {
            System.out.println("X (" + x + ") NÃO é divisível por Z (" + z + ")");
        }

    }
}