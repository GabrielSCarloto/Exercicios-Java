package Exercicios_Java;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int prato;
		int sobremesa;
		int bebida;
		int caloria = 0;
		
		System.out.println("Escolha um prato: 1 - Vegetariano; 2 - Peixe; 3 - Frango; 4 - Carne");
		prato = entrada.nextInt();
		
		switch(prato) {
		case 1:
			caloria = caloria + 180;
			System.out.println("Vegetariano: 180 cal.");
		break;
		
		case 2:
			caloria = caloria + 230;
			System.out.println("Peixe: 230 cal.");
		break;
		
		case 3:
			caloria = caloria + 250;
			System.out.println("Frango: 250 cal.");
		break;
		
		case 4:
			caloria = caloria + 350;
			System.out.println("Carne: 350 cal.");
		break;
		}
		
		System.out.println("Escolha uma sobremesa: 1 - Abacaxi; 2 - Sorvete Diet; 3 - Mouse Diet; 4 - Mouse Chocolate");
		sobremesa = entrada.nextInt();
		
		switch(sobremesa) {
		case 1:
			caloria = caloria + 75;
			System.out.println("Abacaxi: 75 cal.");
		break;
		
		case 2:
			caloria = caloria + 110;
			System.out.println("Sorvete Diet: 110 cal.");
		break;
		
		case 3:
			caloria = caloria + 170;
			System.out.println("Mouse Diet: 170 cal.");
		break;
		
		case 4:
			caloria = caloria + 200;
			System.out.println("Mouse Chocolate: 200 cal.");
		break;
		}
		
		System.out.println("Escolha uma bebida: 1 - Chá; 2 - Suco de Laranja; 3 - Suco de Melão; 4 - Refrigerante Diet");
		bebida = entrada.nextInt();
		
		switch(bebida) {
		case 1:
			caloria = caloria + 20;
			System.out.println("Chá: 20 cal.");
		break;
		
		case 2:
			caloria = caloria + 70;
			System.out.println("Sorvete Diet: 70 cal.");
		break;
		
		case 3:
			caloria = caloria + 100;
			System.out.println("Mouse Diet: 100 cal.");
		break;
		
		case 4:
			caloria = caloria + 65;
			System.out.println("Mouse Chocolate: 65 cal.");
		break;
		}
		
		System.out.printf("A sua refeição tem: " + caloria + "cal.");
	}
}
	
