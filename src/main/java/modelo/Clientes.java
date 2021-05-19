package modelo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(
		name = "Clientes",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_clientes", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class Clientes {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_clientes;
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "cliente")
	private List<CuentasBancarias> clientes_id_cuentas;
	
	
	public int getId_clientes() {
		return id_clientes;
	}
	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<CuentasBancarias> getClientes_id_cuentas() {
		return clientes_id_cuentas;
	}
	public void setClientes_id_cuentas(List<CuentasBancarias> clientes_id_cuentas) {
		this.clientes_id_cuentas = clientes_id_cuentas;
	}
	
	
	
	
	
}
