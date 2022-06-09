package Exercicios_Java;

import java.util.*;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Coloque a sua idade: ");
		idade = entrada.nextInt();

		if(idade<16) {
			System.out.println("Não eleitor.");
		}else if(idade<18) {
					System.out.println("Eleitor facultativo.");
				}
		
		if(idade>=18 && idade<70) {
			System.out.println("Eleitor obrigatório.");
		}else if (idade>=70){
					System.out.println("Eleitor facultativo.");
				}
		
	}
}