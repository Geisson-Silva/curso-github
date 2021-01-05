import java.util.Locale;
import java.util.Scanner;

public class exercicioMatematica {

	private static double diferenca1;

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			/*
			int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);
			
			
			double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);
	
			
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();	
			double D = sc.nextDouble();
			
		
		    double diferenca = (A*B-C*D);
		  
		    
		    System.out.printf("Diferença = %.2f%n", diferenca);
		    
		    
		    
			int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
			
			
			int cod1, cod2, qte1, qte2;
		    double preco1, preco2, total;

		    cod1 = sc.nextInt();
		    qte1 = sc.nextInt();
		    preco1 = sc.nextDouble();
		    
		    cod2 = sc.nextInt();
		    qte2 = sc.nextInt();
		    preco2 = sc.nextDouble();

		    total = preco1 * qte1 + preco2 * qte2;

		    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
			*/
			
			double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
			
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			
			triangulo = A * C / 2.0;
			circulo = 3.14159 * C * C;
			trapezio = (A + B) / 2.0 * C;
			quadrado = B * B;
			retangulo = A * B;
			
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			System.out.printf("TRAPEZIO: %.3f%n", trapezio);
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			System.out.printf("RETANGULO: %.3f%n", retangulo);
			
		    sc.close();

	}

}
