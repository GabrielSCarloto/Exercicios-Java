package Exercicios_Java;

import java.util.*;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int TemperaturaC;
		int TemperaturaF;
		
		System.out.println("Digite a temperatura em Celsius para fazer a conversão para Fahreinheit: ");
		TemperaturaC = entrada.nextInt();
		
		TemperaturaF = (9 * TemperaturaC + 160) / 5;
		
		System.out.println(TemperaturaC + "°C é igual à " + TemperaturaF + "°F.");
		
	}
}