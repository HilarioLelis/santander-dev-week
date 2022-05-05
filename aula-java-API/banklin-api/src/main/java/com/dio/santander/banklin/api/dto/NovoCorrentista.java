//camada de interação com os usuários

package com.dio.santander.banklin.api.dto;

public class NovoCorrentista {
	private String name;
	private String cpf;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
