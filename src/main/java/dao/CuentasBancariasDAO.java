package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.CuentasBancarias;


@Stateless
public class CuentasBancariasDAO {

	@Inject
	private EntityManager em;
	
	public void insert(CuentasBancarias cuentas_bancarias) {
		em.persist(cuentas_bancarias);
	}
	
	public void update(CuentasBancarias cuentas_bancarias) {
		em.merge(cuentas_bancarias);
	}
	
	public void remove(int codigo) {
		CuentasBancarias cuentas_bancarias = this.read(codigo);
		em.remove(cuentas_bancarias);
	}
	
	public CuentasBancarias read(int codigo) {
		CuentasBancarias u = em.find(CuentasBancarias.class, codigo);
		return u;
	}
	
	public List<CuentasBancarias> getCertificados(){
		String jpql = "SELECT u FROM CuentasBancarias u";
		Query q = em.createQuery(jpql, CuentasBancarias.class);
		
		List<CuentasBancarias> cuentas_bancarias = q.getResultList();
		
		return cuentas_bancarias;
	}
	
}
