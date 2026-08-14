import java.util.Scanner;
public class Main{
    static void main() {
        Scanner entradaMatricula = new Scanner(System.in);
        int numMatricula = entradaMatricula.nextInt();
        int [] programacao = new int[numMatricula];
        int [] calculo = new int[numMatricula];
        for (int i = 0; i < numMatricula; i++) {
            System.out.println("Matrícula dos alunos cursando Programação Modular: ");
            programacao[i] = entradaMatricula.nextInt();
        }
        for (int i = 0; i < numMatricula; i++) {
            System.out.println("Matrícula dos alunos cursando cálculo :");
            calculo[i] = entradaMatricula.nextInt();
        }
        for (int i = 0; i < numMatricula; i++) {
            for (int j = 0; j < numMatricula; j++) {
                if(calculo[j] == programacao[i]){
                    System.out.println("Alunos que fazem as duas matérias: "+calculo[j]);
                }
            }
        }
    }
}