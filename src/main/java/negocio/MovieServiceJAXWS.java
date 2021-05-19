package negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import modelo.Transacciones;

/**
 * Session Bean implementation class MovieServiceJAXWS
 */
@Stateless
@LocalBean
@WebService
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class MovieServiceJAXWS {
	
	@EJB
	MovieData moviedata;

    /**
     * Default constructor. 
     */
    public MovieServiceJAXWS() {
        // TODO Auto-generated constructor stub
    }
    
    @WebMethod(operationName = "getMovies")
    @WebResult(name = "returnMovies")
    @XmlTransient
    public String getMovie() {
		return "El serivicio corre correctamente";
	}
    /*
     * Comentado porque este es el metodo que debe servir pero da un error, mientras se envia otro metodo solo para probar si el servicio corre en el wildfly devolviendo un mensaje
     * 
     * public List<Transacciones> getMovie() {
		return moviedata.obtenerTransacciones();
	}*/

}
