import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        //Utilização da classe scanner - atualização
        Scanner entradaDados = new Scanner(System.in);

        //Dialogo com o usuário
        System.out.println("Por favor, digite o número da agência ");
        agencia = entradaDados.nextLine();
        System.out.println("Por favor, digite o número da conta corrente ");
        numero = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.println("Por favor, digite o seu nome ");
        nomeCliente = entradaDados.nextLine();
        System.out.println("Por favor, digite o seu saldo ");
        saldo = entradaDados.nextDouble();

        //Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " n° da conta "+ numero + " e seu saldo é de R$ " + saldo + " já está disponível para saque");

    }
}
