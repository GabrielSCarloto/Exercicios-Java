package Exercicios_Java;

import java.util.*;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		
		System.out.println("Saiba quantos n�meros dentro desses 20 est�o entre 0 e 100, 101 e 200 e maiores que 200!");
		
		for(int i = 0; i < numero.length; i++) {
			System.out.printf("Digite um n�mero %d: ", i + 1);
			numero[i] = entrada.nextInt();
		
			if(numero[i] >= 0 && numero[i] <= 100 ) {
				contador1++;
			}
			if(numero[i] >= 101 && numero[i] <= 200 ) {
				contador2++;
			}
			if(numero[i] >= 201) {
				contador3++;
			}
		}
		
		System.out.println("A quantidade de n�meros que est�o entre 0 e 100: " + contador1);
		System.out.println("A quantidade de n�meros que est�o entre 101 e 200: " + contador2);
		System.out.println("A quantidade de n�meros que s�o maiores que 200: " + contador3);
	}
}