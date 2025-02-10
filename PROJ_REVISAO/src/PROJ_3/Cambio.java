package PROJ_3;
import java.util.Scanner;

public class Cambio {
	static float valor;
	static float quant_cambio;
	
	public Cambio (float valor, float quant_cambio) {
		
		this.valor = valor;
		this.quant_cambio = quant_cambio;
	}
	
	public static float calcular() {
		double resultado = (valor * quant_cambio) * 1.06;
		
		return (float) resultado;
	}
	
	public static void ApresentaCotacao (){
		 System.out.printf("Valor a ser pago em reais = %.2f\n", calcular());
	}
}
