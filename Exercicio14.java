package Exercicios_Java;

import java.util.*;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;
		int numero7;
		int numero8;
		int numero9;
		int numero10;
		int soma;
		
		System.out.println("Você irá digitar 10 números e no final saberá a soma deles! \n");
		
		System.out.println("Digite o primeiro número: \n");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo número: \n");
		numero2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: \n");
		numero3 = entrada.nextInt();
		System.out.println("Digite o quarto número: \n");
		numero4 = entrada.nextInt();
		System.out.println("Digite o quinto número: \n");
		numero5 = entrada.nextInt();
		System.out.println("Digite o sexto número: \n");
		numero6 = entrada.nextInt();
		System.out.println("Digite o sétimo número: \n");
		numero7 = entrada.nextInt();
		System.out.println("Digite o oitavo número: \n");
		numero8 = entrada.nextInt();
		System.out.println("Digite o nono número: \n");
		numero9 = entrada.nextInt();
		System.out.println("Digite o décimo número: \n");
		numero10 = entrada.nextInt();
		
		soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
		
		System.out.println("A soma desses números é: " + soma);
	}
}