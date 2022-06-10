package Exercicios_Java;

import java.util.*;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while(numero >= 0){
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			soma = numero + soma;
			System.out.println("Resultado: " + soma);
		}if(numero < 0) {
			System.out.println("Esse número é inválido.");
		}
	}
}