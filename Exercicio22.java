package Exercicios_Java;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 20;
		
		System.out.println("Saiba quantos n�meros dentro desses 20 est�o entre 0 e 100!");
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite um n�mero %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 0 && numero[i] >= 100 ) {
				contador--;
			}
		}
		
		System.out.println("A quantidade de n�meros que est�o entre 0 e 100: " + contador);
	}
}