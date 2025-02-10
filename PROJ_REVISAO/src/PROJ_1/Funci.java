package PROJ_1;
import java.util.Scanner;

public class Funci {
	String nome;
	float salario_b;
	float imposto;
	float aumento;
	
	public Funci (String nome, float salario_b, float imposto, float aumento ) {
		this.nome = nome;
		this.salario_b = salario_b;
		this.imposto = imposto;
		this.aumento = aumento;
	}
	
	public void apresentaFunc() {
		System.out.printf("%s, %.2f", nome, (salario_b - imposto));
	}
	
	public float AumentarSalario () {
		float liq = (salario_b - imposto);
		liq += (salario_b * aumento / 100);
		return (float) liq;
	}
	
	public void atualizado () {
		System.out.printf("\nDados atualizados: %s, %.2f", nome, (salario_b - imposto + (salario_b * aumento/100)));
	}
}
