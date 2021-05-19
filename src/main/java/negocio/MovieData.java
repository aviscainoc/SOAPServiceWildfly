package negocio;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import dao.TransaccionesDAO;
import modelo.Transacciones;

/**
 * Session Bean implementation class MovieData
 */
@Singleton
@LocalBean
@Startup
public class MovieData {
	
	@Inject
	TransaccionesDAO daoT;
	
	private List<Transacciones> transacciones;

    /**
     * Default constructor. 
     */
    public MovieData() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void initial() {
    	
    	transacciones = new ArrayList<Transacciones>();
    	
    	
    	
    	
    }
    
    public List<Transacciones> obtenerTransacciones() {
    	
    	transacciones=daoT.getCertificados();
    	
    	return transacciones;
    }

}
