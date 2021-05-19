package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
		name = "Cuentas_Bancarias",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_cuentas", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class CuentasBancarias {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_cuentas;
	private String moneda;
	
	@ManyToOne
	private Clientes cliente;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "cuenta")
	private List<Transacciones> cuentas_id_transacciones;
	
	
	
	public int getId_cuentas() {
		return id_cuentas;
	}
	public void setId_cuentas(int id_cuentas) {
		this.id_cuentas = id_cuentas;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public List<Transacciones> getCuentas_id_transacciones() {
		return cuentas_id_transacciones;
	}
	public void setCuentas_id_transacciones(List<Transacciones> cuentas_id_transacciones) {
		this.cuentas_id_transacciones = cuentas_id_transacciones;
	}

	
	
	
}
