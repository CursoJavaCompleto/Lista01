import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double atr = (a * c) / 2;
		double acr = 3.14159 * Math.pow(c, 2);
		double at = (a + b) * c / 2;
		double aq = Math.pow(b, 2);
		double ar = a * b;
		
		System.out.println(atr);
		System.out.println(acr);
		System.out.println(at);
		System.out.println(aq);
		System.out.println(ar);
		
		
		
	}

}
