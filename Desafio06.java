import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro");
        num = ler.nextInt();

        if(num >= 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}
