package PROJ_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Nome: ");
		String nome = scanner.next();
		
		System.out.print("\nSalário Bruto: ");
		float salario_b = scanner.nextFloat();
		
		System.out.print("\nIsmposto:: ");
		float imposto = scanner.nextFloat();
		
		System.out.print("\nQual a porcentagem para aumentar o salário? ");
		float aumento = scanner.nextFloat();
		
		Funci funci = new Funci(nome, salario_b, imposto, aumento);
		
		funci.apresentaFunc();
	
	
		funci.atualizado();
		

	}

}
