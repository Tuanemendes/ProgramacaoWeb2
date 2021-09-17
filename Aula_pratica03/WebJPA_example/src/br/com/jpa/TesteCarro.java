package br.com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCarro {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager manager = factory.createEntityManager();
		
		Carro carro = new Carro();
		carro.setModelo("Palio");
		carro.setAno(2007);
		
		manager.getTransaction().begin();
		manager.persist(carro);
		manager.getTransaction().commit();
		
	}

}
