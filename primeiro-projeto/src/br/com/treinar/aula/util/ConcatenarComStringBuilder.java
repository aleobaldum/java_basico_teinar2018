package br.com.treinar.aula.util;

public class ConcatenarComStringBuilder {

	public static void main(String[] args) {
	
		String nome = "Alexandre";
		String nomeMeio = "Oliveira";
		String ultimoNome = "Baldoino";
		StringBuilder sc = new StringBuilder();
		sc.append(nome).append(" ").append(nomeMeio).append(" ").append(ultimoNome);
		System.out.println(sc);

	}
	}


