package br.com.desafio.dio.domain;

import lombok.Data;

@Data
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 01;
	protected int agencia;
	protected int numero;
	protected double saldo;
	private static int SEQUENCIAL = 1;
	protected Cliente cliente;

	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		saldo -=  valor;
		
	}


	public void depositar(double valor) {
		saldo +=  valor;
	}


	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s",cliente.getNome() ));
		System.out.println(String.format("Agência: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}


	}


