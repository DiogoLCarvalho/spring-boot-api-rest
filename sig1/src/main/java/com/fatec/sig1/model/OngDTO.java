package com.fatec.sig1.model;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CNPJ;

public class OngDTO {
	
	@NotBlank(message = "Nome é requerido")
	private String nome;
	
	@NotBlank(message = "Insira apenas números")
	private long telefone;
	
	@CNPJ	
	private String cnpj;
	
	@NotBlank(message = "O CNAE é obrigatorio")
    private String cnae;
    
	@NotBlank(message = "O CEP é obrigatório.")
	private String cep;
	
	private String complemento;
	private String descricao;
	private String segmento;

	@NotBlank(message = "O Email é obrigatório")
	private String email;

	@NotBlank(message = "A senha é obrigatório")
	private String senha;

	public OngDTO(String nome, long telefone, String cnpj, String cnae, String cep, String complemento, String descricao,String segmento, String email, String senha) {
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.cnae = cnae;
		this.cep = cep;
		this.complemento = complemento;
		this.descricao = descricao;
		this.segmento = segmento;
		this.email = email;
		this.senha = senha;
	}
	
	public OngDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Ong retornaUmCliente() {
		return new Ong(nome, telefone, cep, complemento, descricao, segmento, email, senha, cnpj, cnae);
	}

}
