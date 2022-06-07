package Exercicios_Java;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double numero = 0;
		boolean divisao = false;
		
		System.out.println("Entre com um número:");
		numero = entrada.nextDouble();
		
		if (numero % 2 == 0){
			System.out.println("Esse número é divisivel por 2!");
			divisao = true;
		}if (numero % 5 == 0){
			System.out.println("Esse número é divisivel por 5!");
			divisao = true;
		}if (numero % 10 == 0){
			System.out.println("Esse número é divisivel por 10!");
			divisao = true;
		}else if (divisao == false) {
			System.out.println("Esse número não é dívisivel.");
		}
	
	}
}
