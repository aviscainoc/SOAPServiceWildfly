package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.TipoTransaccion;




@Stateless
public class TipoTransaccionDAO {
	
	@Inject
	private EntityManager em;

	public void insert(TipoTransaccion tipo_transaccion) {
		em.persist(tipo_transaccion);
	}
	
	public void update(TipoTransaccion tipo_transaccion) {
		em.merge(tipo_transaccion);
	}
	
	public void remove(int codigo) {
		TipoTransaccion tipo_transaccion = this.read(codigo);
		em.remove(tipo_transaccion);
	}
	
	public TipoTransaccion read(int codigo) {
		TipoTransaccion u = em.find(TipoTransaccion.class, codigo);
		return u;
	}
	
	public List<TipoTransaccion> getCertificados(){
		String jpql = "SELECT u FROM TipoTransaccion u";
		Query q = em.createQuery(jpql, TipoTransaccion.class);
		
		List<TipoTransaccion> tipo_transaccion = q.getResultList();
		
		return tipo_transaccion;
	}
	
}
