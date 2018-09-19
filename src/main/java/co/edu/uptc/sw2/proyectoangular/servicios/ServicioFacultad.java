/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.FacultadLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Facultad;
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
@Path("ServicioFacultad")
@Stateless
public class ServicioFacultad {

    @EJB
    private FacultadLogica facultadLogica;
    
    @GET
    public List<Facultad> consultarFacultad() {
        return facultadLogica.getListaFacultad();
    }
    
    @POST
    public Facultad guardarFacultad(Facultad facultad) {
        facultad.setId(facultadLogica.getListaFacultad().size() + 1);
        facultadLogica.getListaFacultad().add(facultad);
        return facultad;
    }

    @POST
    @Path("editarFacultad")
    public void editarFacultad(Facultad facultad) {
        facultadLogica.editarFacultad(facultad);
    }

    @POST
    @Path("eliminarFacultad")
    public void eliminarFacultad(int id) {
        facultadLogica.eliminarFacultad(id);
    }
    
}
