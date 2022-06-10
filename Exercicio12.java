package Exercicios_Java;

public class Exercicio12 {

	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		
		while(numero <= 15) {
			soma = soma + numero;
			numero = numero + 1;
		}
		
		System.out.println("A soma dos números de 1 a 15 é: " + soma);
	}
}