import java.util.Scanner;
public class Main{
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int mult = 1;
        for (int i = 1; a >= i; i++) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}