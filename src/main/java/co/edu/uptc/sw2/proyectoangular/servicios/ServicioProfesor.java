/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.ProfesorLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Profesor;
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

@Path("ServicioProfesor")
@Stateless
public class ServicioProfesor {
        @EJB
    private ProfesorLogica profesorLogica;
    
    @GET
    public List<Profesor> consultarProfesor(){
        return profesorLogica.getListaProfesor();
    }
    
    @POST
    public Profesor guardarProfesor(Profesor profesor){
        
        profesor.setId(profesorLogica.getListaProfesor().size() + 1);
        profesorLogica.getListaProfesor().add(profesor);
        return profesor;
    }
    
  
}
