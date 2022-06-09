package Exercicios_Java;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int media1;
		int media2;
		int MediasSomadas;
		int MediasMedias;
		
		media1 = (9 + 8 + 7) / 3;
		media2 = (6 + 5 + 4) / 3;
		MediasSomadas = media1 + media2;
		MediasMedias = (media1 + media2) / 2;
		
		System.out.printf("A média da soma de 7, 8 e 9 é: " + media1 + "\n");
		System.out.printf("A média da soma 4, 5 e 6 é: " + media2 + "\n");
		System.out.printf("A soma das duas médias acima é: " + MediasSomadas + "\n");
		System.out.printf("A média da soma das duas médias acima é: " + MediasMedias + "\n");
	}
}