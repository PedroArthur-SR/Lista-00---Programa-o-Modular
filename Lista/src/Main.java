import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int entradaN = entrada.nextInt();
        int entradaM = entrada.nextInt();
        int[] x = new int[entradaN];
        int[] y = new int[entradaM];
        for (int i = 0; i < entradaN; i++) {
            System.out.println("Números do Vetor X");
            x[i] = entrada.nextInt();
        }
        for (int i = 0; i < entradaM; i++) {
            System.out.println("Números do Vetor Y");
            y[i] = entrada.nextInt();
        }

        int[] z = new int[entradaM + entradaN];
        int posicao = 0;
        for (int i = 0; i < entradaN; i++) {
            boolean repetido = false;
            for (int j = 0; j < posicao; j++) {
                if (z[j] ==  x[i]){
                    repetido = true;
                }
            }
            if (repetido == false){
                z[posicao] = x[i];
                posicao++;
            }
        }
        for (int i = 0; i < entradaM; i++) {
            boolean repetido = false;
            for (int j = 0; j < posicao; j++) {
                if (z[j] ==  y[i]){
                    repetido = true;
                }
            }
            if (repetido == false){
                z[posicao] = y[i];
                posicao++;
            }
        }

        System.out.println("Vetor União Z:");
        for (int i = 0; i < posicao; i++) {
            System.out.print(z[i] + " ");
        }
    }
}