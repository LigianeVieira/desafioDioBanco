package br.com.desafio.dio;

import br.com.desafio.dio.domain.Cliente;
import br.com.desafio.dio.domain.Conta;
import br.com.desafio.dio.domain.ContaCorrente;
import br.com.desafio.dio.domain.ContaPoupanca;


public class Executa {


		
		public static void main(String[] args) {
			
			Cliente luiz = new Cliente();
			luiz.setNome("Luiz");
			
			Conta cc= new ContaCorrente(luiz);
			cc.depositar(100);
			Conta poupanca= new ContaPoupanca(luiz);
			cc.transferir(50, poupanca);
			
			
			poupanca.sacar(20);
			
			
			cc.imprimirExtrato();
			System.out.println("----------------------------------");
			poupanca.imprimirExtrato();
		}
		}




