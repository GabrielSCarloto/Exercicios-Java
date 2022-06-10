package Exercicios_Java;

import java.util.*;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ValorCompra;
		int prestacao;
		
		System.out.println("Descubra o valor das prestações da sua compra! \n");
		
		System.out.println("Informe o valor da sua compra: \n");
		ValorCompra = entrada.nextInt();
		
		prestacao = ValorCompra / 5;
		
		System.out.println("O valor das suas prestações será de " + prestacao + " reais.");
	}
}