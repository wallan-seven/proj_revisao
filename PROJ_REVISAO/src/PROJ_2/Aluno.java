package PROJ_2;
import java.util.Scanner;

public class Aluno {
	String nome;
	static float n1;
	static float n2;
	static float n3;
	
	public Aluno (String nome, float n1, float n2, float n3) {
		
		this.nome = nome;
		this.n1 = (n1 * 100 / 30);
		this.n2 = (n2 * 100 / 35);
		this.n3 = (n3 * 100 / 35);
	}
	
	public static float Media() {
		float media = ((n1 + n2 + n3)/3);
		return (float) media;
	}
	
	public static void estadoMedia() {
		float ui = Media();
		System.out.printf("NOTA FINAL = %.2f", ui);
		System.out.println();

		if (ui >= 60) {
			System.out.println("PASS!!!");
		} else {
			System.out.println("FAILED!!!");
			System.out.printf("FAlTARAM %.2f PONTOS!", (60 - ui));
		}
	}
}
