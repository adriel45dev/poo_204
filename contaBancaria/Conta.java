public class Conta {
    private String nomeTitular;
    private int numConta;
    private double saldo;

    public Conta(String nomeTitular, int numConta){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
    }
    public Conta(String nomeTitular, int numConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        this.saldo -= saldo + 5;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String toString() {
        return "Conta "
                + numConta
                + ", Titular: "
                + nomeTitular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }


}
