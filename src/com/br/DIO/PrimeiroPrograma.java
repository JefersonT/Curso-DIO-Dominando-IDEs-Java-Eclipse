package com.br.DIO;

import com.br.DIO.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 2;
//		int b = 3;
//		System.out.println("Hello word!" + (a + b));
		
		Gato gato = new Gato();
		
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		System.out.println("Testando Commit Online");
		
		
		

	}

}

class Livros {
	private String name;
	private String npag;
}
