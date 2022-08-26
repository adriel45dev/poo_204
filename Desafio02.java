import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o raio");
        raio = ler.nextDouble();

        area = pi * (raio * raio);
        System.out.println("A área do circulo é: " + area);

    }
}
