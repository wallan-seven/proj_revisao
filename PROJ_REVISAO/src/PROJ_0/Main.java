package PROJ_0;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura do retângulo:");
		float largura = scanner.nextFloat();
		float altura = scanner.nextFloat();
		
		Retangulo retangulo = new Retangulo(largura, altura);
		
		System.out.printf("AREA = %.2f", Retangulo.calcArea());
		System.out.printf("\nPERIMETRO = %.2f", Retangulo.calcPerimetro());
		System.out.printf("\nDIAGONAL = %.2f", Retangulo.calcDiagonal());
		
	}
}
