package com.br.DIO.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma (a, b);
		int subtracao = subtracao (a, b);
		float divisao = divisao (a, b);
		int multiplicacao = multiplicacao (a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subra��o: " + subtracao);
		System.out.println("Divis�o: " + divisao);
		System.out.println("Multiplica��o " + multiplicacao);
		//testando commit
		
		
				

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static float divisao(float a, float b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
