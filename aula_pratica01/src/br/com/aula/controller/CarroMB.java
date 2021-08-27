package br.com.aula.controller;

import javax.faces.bean.ManagedBean;

import br.com.aula.model.Carro;

@ManagedBean
public class CarroMB {
	
	Carro carro = new Carro();
	

	public String getCor() {
		return carro.getCor();
	}
	public void setCor(String cor) {
		carro.setCor(cor);
	}
	public String getModelo() {
		return carro.getModelo();
	}
	public void setModelo(String modelo) {
		carro.setModelo(modelo);
	}
	public String getMarca() {
		return carro.getMarca();
	}
	public void setMarca(String marca) {
		carro.setMarca(marca);
	}
	public Integer getAno() {
		return carro.getAno();
	}
	public void setAno(Integer ano) {
		carro.setAno(ano);
	}	
}
