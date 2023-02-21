import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        Integer numero = scan.nextInt();
        System.out.println("Digite o numero da agencia: ");
        String agencia = scan.next();
        scan.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        System.out.println("Digite o saldo: ");
        Double saldo = scan.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está dispoível para saque.");
    }
}