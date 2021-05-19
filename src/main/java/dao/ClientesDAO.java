package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Clientes;


@Stateless
public class ClientesDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Clientes clientes) {
		em.persist(clientes);
	}
	
	public void update(Clientes clientes) {
		em.merge(clientes);
	}
	
	public void remove(int codigo) {
		Clientes clientes = this.read(codigo);
		em.remove(clientes);
	}
	
	public Clientes read(int codigo) {
		Clientes u = em.find(Clientes.class, codigo);
		return u;
	}
	
	public List<Clientes> getCertificados(){
		String jpql = "SELECT u FROM Clientes u";
		Query q = em.createQuery(jpql, Clientes.class);
		
		List<Clientes> clientes = q.getResultList();
		
		return clientes;
	}
	
}
