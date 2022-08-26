import java.util.Scanner;

public class Desafio07 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int horaInicial = ler.nextInt();
        int horaFinal = ler.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
