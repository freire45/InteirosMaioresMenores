package br.com.erickfreire.inteirosmaioresmenores;

import java.util.Scanner;

/**
 * Crie um programa em Java que leia 5 valores e informe qual o valor maior e qual o menor
 * @author Erick Freire
 * @version 1 - Criado em 26-03-2021 as 23:06
 */

public class InteirosMaioresMenores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		System.out.print("Digite o numero1: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o numero2: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o numero3: ");
		numero3 = entrada.nextInt();
		System.out.print("Digite o numero4: ");
		numero4 = entrada.nextInt();
		System.out.print("Digite o numero5: ");
		numero5 = entrada.nextInt();
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				if(numero1 > numero4)
					if(numero1 > numero5)
						System.out.printf("O maior número é o 1: %d%n", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				if(numero2 > numero4)
					if(numero2 > numero5)
						System.out.printf("O maior número é o 2: %d%n", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				if(numero3 > numero4)
					if(numero3 > numero5)
						System.out.printf("O maior número é o 3: %d%n", numero3);
		
		if(numero4 > numero1)
			if(numero4 > numero2)
				if(numero4 > numero3)
					if(numero4 > numero5)
						System.out.printf("O maior número é o 4: %d%n", numero4);
		
		if(numero5 > numero1)
			if(numero5 > numero2)
				if(numero5 > numero3)
					if(numero5 > numero4)
						System.out.printf("O maior número é o 5: %d%n", numero5);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				if(numero1 < numero4)
					if(numero1 < numero5)
						System.out.printf("O menor número é o 1: %d%n", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				if(numero2 < numero4)
					if(numero2 < numero5)
						System.out.printf("O menor número é o 2: %d%n", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				if(numero3 < numero4)
					if(numero3 < numero5)
						System.out.printf("O menor número é o 3: %d%n", numero3);
		
		if(numero4 < numero1)
			if(numero4 < numero2)
				if(numero4 < numero3)
					if(numero4 < numero5)
						System.out.printf("O menor número é o 4: %d%n", numero4);
		
		if(numero5 < numero1)
			if(numero5 < numero2)
				if(numero5 < numero3)
					if(numero5 < numero4)
						System.out.printf("O menor número é o 5: %d%n", numero5);
		

	}

}
