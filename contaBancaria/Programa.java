import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o número da conta:");
        int numConta = sc.nextInt();
        System.out.println("Digite o nome do titular:");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("Tem um deposito inicial (s/n)?");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.println("Digite o valor do depósito");
            double deposito = sc.nextDouble();
            conta = new Conta(nomeTitular, numConta, deposito);

        } else {
            conta = new Conta(nomeTitular, numConta);
        }

        System.out.println();
        System.out.println("Informações:");
        System.out.println(conta);


    }
}
