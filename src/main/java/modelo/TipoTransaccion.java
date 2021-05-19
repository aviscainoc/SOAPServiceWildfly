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
		name = "Tipo_Transaccion",
		initialValue = 1, 
		pkColumnName = "ENTITY", 
		pkColumnValue = "id_tipo", 
		allocationSize = 1, 
		table = "ENTITY_GENERATOR"
		
		)

public class TipoTransaccion {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_tipo;
	private String tipo;
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tipo_id_tipo")
	private List<Transacciones> tipo_id_transacciones;

	
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Transacciones> getTipo_id_transacciones() {
		return tipo_id_transacciones;
	}
	public void setTipo_id_transacciones(List<Transacciones> tipo_id_transacciones) {
		this.tipo_id_transacciones = tipo_id_transacciones;
	}

	
	
}
