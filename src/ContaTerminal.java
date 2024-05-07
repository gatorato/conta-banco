import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência ");
        agencia = entradaDados.nextLine();
        System.out.println("Por favor, digite o número da conta corrente ");
        numero = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.println("Por favor, digite o seu nome ");
        nomeCliente = entradaDados.nextLine();
        System.out.println("Por favor, digite o seu saldo ");
        saldo = entradaDados.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " n° da conta "+ numero + " e seu saldo é de R$ " + saldo + " já está disponível para saque");

    }
}
