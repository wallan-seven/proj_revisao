package PROJ_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.next();
		float n1 = scanner.nextFloat();
		float n2 = scanner.nextFloat();
		float n3= scanner.nextFloat();
		
		Aluno aluno = new Aluno(nome, n1, n2, n3);
		
		Aluno.estadoMedia();
		

	}

}
