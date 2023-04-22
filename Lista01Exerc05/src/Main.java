import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int numDePecas = sc.nextInt();
		double valorUnitario = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int numDePecas2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();

		double total1 = numDePecas * valorUnitario;
		double total2 = numDePecas2 * valorUnitario2;
		double total = total1 + total2;

		System.out.printf("Valor a pagar: R$ %.2f%n", total);

		sc.close();

	}

}
