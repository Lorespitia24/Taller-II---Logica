/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.MatriculaLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Matricula;
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

@Path("ServicioMatricula")
@Stateless
public class ServicioMatricula {
        @EJB
    private MatriculaLogica matriculaLogica;
    
    @GET
    public List<Matricula> consultarMatricula(){
        return matriculaLogica.getListaMatricula();
    }
    
    @POST
    public Matricula guardarMatricula(Matricula matricula){
        
        matricula.setId(matriculaLogica.getListaMatricula().size() + 1);
        matriculaLogica.getListaMatricula().add(matricula);
        return matricula;
    }
    @POST
    @Path("editarMatricula")
    public void editarMatricula(Matricula matricula) {
        matriculaLogica.editarMatricula(matricula);
    }

    @POST
    @Path("eliminarMatricula")
    public void eliminarMatricula(int id) {
        matriculaLogica.eliminarMatricula(id);
    }
      
  
}
