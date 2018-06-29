package br.com.treinar.aula.exception;

public class AtividadeException {

	public static void main(String[] args) {
		try {
			metodoQueRecebeExcecao(78);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static void metodoQueRecebeExcecao(int numero) throws Exception {

		if (numero > 48) {
			throw new Exception("O numero "+ numero + " Eh invalido");
		}else {
			System.out.println("Numero maior que 48");
		}
	}
}