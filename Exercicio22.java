package Exercicios_Java;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 20;
		
		System.out.println("Saiba quantos números dentro desses 20 estão entre 0 e 100!");
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite um número %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 0 && numero[i] >= 100 ) {
				contador--;
			}
		}
		
		System.out.println("A quantidade de números que estão entre 0 e 100: " + contador);
	}
}