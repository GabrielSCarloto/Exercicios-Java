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
		
		System.out.println("Voc� ir� digitar 10 n�meros e no final saber� a soma deles! \n");
		
		System.out.println("Digite o primeiro n�mero: \n");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero: \n");
		numero2 = entrada.nextInt();
		System.out.println("Digite o terceiro n�mero: \n");
		numero3 = entrada.nextInt();
		System.out.println("Digite o quarto n�mero: \n");
		numero4 = entrada.nextInt();
		System.out.println("Digite o quinto n�mero: \n");
		numero5 = entrada.nextInt();
		System.out.println("Digite o sexto n�mero: \n");
		numero6 = entrada.nextInt();
		System.out.println("Digite o s�timo n�mero: \n");
		numero7 = entrada.nextInt();
		System.out.println("Digite o oitavo n�mero: \n");
		numero8 = entrada.nextInt();
		System.out.println("Digite o nono n�mero: \n");
		numero9 = entrada.nextInt();
		System.out.println("Digite o d�cimo n�mero: \n");
		numero10 = entrada.nextInt();
		
		soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
		
		System.out.println("A soma desses n�meros �: " + soma);
	}
}