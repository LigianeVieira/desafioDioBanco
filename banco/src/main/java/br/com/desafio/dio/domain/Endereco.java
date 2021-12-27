package br.com.desafio.dio.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode
public class Endereco {
	
	@Getter @Setter private String local;
	@Getter @Setter private Byte numero;
	@Getter @Setter private String cidade;
	@Getter @Setter private String bairro;
	@Getter @Setter private String estado;
	@Getter @Setter private String cep;
}
