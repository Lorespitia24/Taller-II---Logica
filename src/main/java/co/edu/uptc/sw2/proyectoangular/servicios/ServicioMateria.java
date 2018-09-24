/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.MateriaLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Estudiante;
import co.edu.uptc.sw2.proyectoangular.objetos.Materia;
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

@Path("ServicioMateria")
@Stateless
public class ServicioMateria {
          @EJB
    private MateriaLogica materiaLogica;
    @GET
    public List<Materia> consultarMateria(){
        return materiaLogica.getListaMateria();
    }
    
    @POST
    public Materia guardarMateria(Materia materia){
        
        materia.setId(materiaLogica.getListaMateria().size() + 1);
        materiaLogica.getListaMateria().add(materia);
        return materia;
    }
 
    //metodos
    @POST
    @Path("editarMateria")
    public void editarEstudiante(Materia materia) {
        materiaLogica.editarMateria(materia);
    }

    @POST
    @Path("eliminarMateria")
    public void eliminarMateria(int id) {
        materiaLogica.eliminarMateria(id);
    }
    
  
}
