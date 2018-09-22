
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.MunicipioLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Municipio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioMunicipio")
@Stateless
public class ServicioMunicipio {
        @EJB
    private MunicipioLogica municipioLogica;
    @GET
    public List<Municipio> consultarMunicipio(){
        return municipioLogica.getListaMunicipio();
    }
    
    @POST
    public Municipio guardarMunicipio(Municipio municipio){
        
        municipio.setId(municipioLogica.getListaMunicipio().size() + 1);
        municipioLogica.getListaMunicipio().add(municipio);
        return municipio;
    }
    //metodos
    @POST
    @Path("editarMunicipio")
    public void editarMunicipio(Municipio municipio) {
        municipioLogica.editarMunicipio(municipio);
    }

    @POST
    @Path("eliminarMunicipio")
    public void eliminarMunicipio(int id) {
        municipioLogica.eliminarMunicipio(id);
    }
    
  
}
