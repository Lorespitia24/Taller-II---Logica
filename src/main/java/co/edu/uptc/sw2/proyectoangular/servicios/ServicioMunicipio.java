/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
  
}
