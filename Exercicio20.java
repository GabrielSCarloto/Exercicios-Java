package Exercicios_Java;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 0;
		
		System.out.println("Saiba quantos n�meros dentro desses 20 que s�o maiores que 8!");
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite o n�mero %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 8) {
				contador++;
			}
		}
		
		System.out.println("A quantidade de n�meros que s�o maiores que 8 �: " + contador);
	}
}