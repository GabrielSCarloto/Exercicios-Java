package Exercicios_Java;

import java.util.*;

public class Exercicio18 {

	public static void main(String[] args) {
		
        String[] nome = new String[10];
        int[] idade = new int[10];
        int IdadeMaisNova = 99;
        String NomeMaisNova = "";

        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = entrada.next();
            System.out.println("Digite a idade:");
            idade[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (idade[i] < IdadeMaisNova) {
                IdadeMaisNova = idade[i];
                NomeMaisNova = nome[i];
            }
        }
        
        System.out.println("A pessoa mais nova é " + NomeMaisNova + " e ela tem " + IdadeMaisNova + "anos.");
	}
}