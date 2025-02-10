package PROJ_0;
import java.util.Scanner;

public class Retangulo {
	static float largura;
	static float altura;
	
	public Retangulo(float largura, float altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public static float calcArea () {

		return largura * altura;
		}
	
	public static float calcPerimetro (){
		return 2 * (largura + altura);
		}
	
	public static float calcDiagonal(){
		return (float) Math.sqrt(largura * largura + altura * altura);
	}

}
