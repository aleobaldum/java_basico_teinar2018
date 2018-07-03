package br.com.treinar.aula.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestaSaida {
	public static void main(String[] args) throws IOException {
		
		Scanner leitora = new Scanner(System.in);
		OutputStream os = new FileOutputStream("data/saida.txt", Boolean.TRUE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		String nome = "";
		while (nome.equals("sair") ) {
			bw.newLine();
			bw.write("Nova Linha");
			
		}
		bw.close();
	}
}