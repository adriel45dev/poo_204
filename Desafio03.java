import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double a,b,c,d, diferenca;

        System.out.println("Digite os valores:");
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        d = ler.nextDouble();

        diferenca = (a * b - c * d);

        System.out.println("A diferença é:" + diferenca);


    }
}
