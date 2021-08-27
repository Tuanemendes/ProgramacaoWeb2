package br.com.aula.model;

public class Carro {
	
	private  String cor;
	private  String modelo;
	private  String marca;
	private  Integer ano;
	
	public Carro() {
		
	}
	
	public Carro (String cor, String modelo,String marca, Integer ano) {
		super();
		this.cor = cor; 
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano; 
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	

}
