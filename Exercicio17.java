package Exercicios_Java;

import java.util.*;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] idade = new int[20];
		int contador = 0;
		
		System.out.println("Saiba quantas pessoas dentro dessas 20 são maiores de idade!");
		
		for(int i = 0; i < idade.length; i++) {
			System.out.printf("Digite a idade da pessoa %d: ", i + 1);
			idade[i] = entrada.nextInt();
		
			if(idade[i] >= 18) {
				contador++;
			}
		}
		
		System.out.println("A quantidade de pessoas que são maiores de idade é: " + contador);
	}
}