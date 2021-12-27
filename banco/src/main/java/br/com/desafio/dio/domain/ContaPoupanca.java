package br.com.desafio.dio.domain;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("**Extrato Conta Poupança**");
		super.imprimirInfosComuns();
		
	}

	
	
	}
	
	
