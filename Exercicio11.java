package Exercicios_Java;

import java.util.*;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int SalarioFixo;
		double TotalValorVendas;
		double comissao;
		double SalarioFinal;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		System.out.println("Digite seu salário fixo: ");
		SalarioFixo = entrada.nextInt();
		System.out.println("Digite o valor total de vendas em reais: ");
		TotalValorVendas = entrada.nextDouble();
		
		comissao = TotalValorVendas * 0.15;
		SalarioFinal = SalarioFixo + comissao;
		
		System.out.printf("Nome: " + nome + ".\n");
		System.out.printf("Salário fixo: " + SalarioFixo + ".\n");
		System.out.printf("Salário final: " + SalarioFinal + ".\n");
	}

}
