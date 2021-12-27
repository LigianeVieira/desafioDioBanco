package br.com.desafio.dio.domain;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("**Extrato Conta Corrente**");
	     super.imprimirInfosComuns();
		
	}
	
	
	


}
