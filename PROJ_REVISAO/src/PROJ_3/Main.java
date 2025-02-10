package PROJ_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar: ");
		float valor = scanner.nextFloat();
		
		System.out.print("Quantos dólares pretende comprar? ");
		float quant_cambio = scanner.nextFloat();
		
		Cambio cambio = new Cambio(valor, quant_cambio);
		
		Cambio.ApresentaCotacao();

	}

}
