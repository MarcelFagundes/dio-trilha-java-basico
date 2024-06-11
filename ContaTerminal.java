import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("---------------Conta Bancária---------------");
		System.out.println();
		System.out.println("Digite o número da Conta: ");
		numero = scanner.nextInt();

		System.out.println("Digite o número da Agência: ");
		agencia = scanner.next();

		System.out.println("Digite o seu nome: ");
		nomeCliente = scanner.next();
		scanner.nextLine();

		System.out.println("Digite seu saldo atual: ");
		saldo = scanner.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, conta criada com sucesso "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para movimentação.", nomeCliente, agencia, numero, saldo);

		scanner.close();
	}

}
