package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Transacciones;



@Stateless
public class TransaccionesDAO {
	
	@Inject
	private EntityManager em;

	public void insert(Transacciones transacciones) {
		em.persist(transacciones);
	}
	
	public void update(Transacciones transacciones) {
		em.merge(transacciones);
	}
	
	public void remove(int codigo) {
		Transacciones transacciones = this.read(codigo);
		em.remove(transacciones);
	}
	
	public Transacciones read(int codigo) {
		Transacciones u = em.find(Transacciones.class, codigo);
		return u;
	}
	
	public List<Transacciones> getCertificados(){
		String jpql = "SELECT u FROM Transacciones u";
		Query q = em.createQuery(jpql, Transacciones.class);
		
		List<Transacciones> transacciones = q.getResultList();
		
		return transacciones;
	}
	
}
