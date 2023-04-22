import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorPorHora;

		System.out.println("Número: " + num);
		System.out.printf("Salário = U$ %.2f%n", salario);

		sc.close();

	}

}
