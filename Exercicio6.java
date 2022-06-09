package Exercicios_Java;

import java.util.*;

public class Exercicio6 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner (System.in);
		
			int numero;
			int calculo1;
			int calculo2;
		
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			calculo1 = numero + 1;
			calculo2 = numero - 1;
			
			System.out.printf("O sucessor do número digitado é: " + calculo1 + "\n");
			System.out.printf("O antecessor do número digitado é: " + calculo2);
	}
}