package Exercicios_Java;

import java.util.*;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int SalarioMinimo = 1212;
		float Salario;
		float calculo;
		
		System.out.println("Informe o seu s�lario em reais: ");
		Salario = entrada.nextFloat();
		
		calculo = Salario / SalarioMinimo;
		
		System.out.printf("O seu s�lario de " + Salario + " reais equivale a " + calculo + " s�larios m�nimos.");
	}

}
