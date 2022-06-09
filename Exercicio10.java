package Exercicios_Java;

import java.util.*;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double Saldo;
		double calculo;
		
		System.out.println("Informe o saldo em reais para reajustar: ");
		Saldo = entrada.nextInt();
		
		calculo = Saldo + (Saldo * 0.015);
		
		System.out.println("O saldo passará a ser de: " + calculo + " reais.");
	}
}