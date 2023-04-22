import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		System.out.println("Informe o raio: ");
		raio = sc.nextDouble();
	
		double area = 3.14159 * Math.pow(raio,2);
	
		System.out.printf("Área = %.4f%n", area);
		
		sc.close();

	}

} 
