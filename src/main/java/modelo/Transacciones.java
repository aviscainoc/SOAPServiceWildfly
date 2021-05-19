package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
		name = "Transacciones",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_transacciones", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class Transacciones {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_transacciones;
	private double monto;
	
	@ManyToOne
	private TipoTransaccion tipo_id_tipo;
	
	@ManyToOne
	private CuentasBancarias cuenta;

	public CuentasBancarias getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentasBancarias cuenta) {
		this.cuenta = cuenta;
	}

	public int getId_transacciones() {
		return id_transacciones;
	}

	public void setId_transacciones(int id_transacciones) {
		this.id_transacciones = id_transacciones;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public TipoTransaccion getTipo_id_tipo() {
		return tipo_id_tipo;
	}

	public void setTipo_id_tipo(TipoTransaccion tipo_id_tipo) {
		this.tipo_id_tipo = tipo_id_tipo;
	}
	
	
	
}
