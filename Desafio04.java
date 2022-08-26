import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double salario, valorPorHora;

        System.out.println("Digite o número do funcionário");
        numeroFuncionario = ler.nextInt();

        System.out.println("Digite o valor por hora trabalhada:");
        valorPorHora = ler.nextInt();

        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas = ler.nextInt();

        salario = horasTrabalhadas * valorPorHora;

        System.out.println("O salário do funcionário é: " + salario);

    }
}
