import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        int maiorIdade = idade;
        int menorIdade = idade;
        int contIdade = 0;
        while(idade != -1){
            String sexo = entrada.next();
            String corOlho = entrada.next();
            String corCabelo = entrada.next();
            if (maiorIdade < idade){
                maiorIdade = idade;
            }if (menorIdade > idade){
                menorIdade = idade;
            }
            if(sexo.equalsIgnoreCase("feminino")){
                if (idade >= 18 && idade <= 35){
                    if (corOlho.equalsIgnoreCase("verde") && corCabelo.equalsIgnoreCase("loiro")){
                        contIdade ++;
                    }
                }
            }
            System.out.println("Digite a idade do próximo habitante (ou -1 para sair):");
            idade = entrada.nextInt();
        }
        System.out.println("A maior idade registrada foi: "+maiorIdade);
        System.out.println("A menor idade registrada foi: "+menorIdade);
        System.out.println("A quantidade de pessoas entre loiras e de olhos verdes entre 18 e 35 anos foi de: "+contIdade);
    }
}