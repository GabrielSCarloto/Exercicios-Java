package Exercicios_Java;

import java.util.*;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int CodigoPeca1;
		int CodigoPeca2;
		float ValorPeca1;
		float ValorPeca2;
		int QuantidadePeca1;
		int QuantidadePeca2;
		float IPI;
		float calculo;
		
		System.out.println("Digite o c�digo da primeira pe�a: ");
		CodigoPeca1 = entrada.nextInt();
		System.out.println("Digite o c�digo da segunda pe�a: ");
		CodigoPeca1 = entrada.nextInt();
		
		System.out.println("Digite o valor da primeira pe�a: ");
		ValorPeca1 = entrada.nextFloat();
		System.out.println("Digite o valor da segunda pe�a: ");
		ValorPeca2 = entrada.nextFloat();
		
		System.out.println("Digite a quantidade da primeira pe�a: ");
		QuantidadePeca1 = entrada.nextInt();
		System.out.println("Digite a quantidade da segunda pe�a: ");
		QuantidadePeca2 = entrada.nextInt();
		
		System.out.println("Digite o IPI: ");
		IPI = entrada.nextFloat();
		
		calculo = (ValorPeca1 * QuantidadePeca1 + ValorPeca2 * QuantidadePeca2) * (IPI/100 + 1);
		
		System.out.println("O valor total a ser pago �: " + calculo + " reais.");
	}
}