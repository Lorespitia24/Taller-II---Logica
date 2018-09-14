/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.Almacenamiento;
import co.edu.uptc.sw2.proyectoangular.logica.EstudianteLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Estudiante;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;



@Path("ServicioEstudiante")
@Stateless
public class ServicioEstudiante {
    @EJB
    private EstudianteLogica estudianteLogica;
    @GET
    public List<Estudiante> consultarEstudiantes(){
        return estudianteLogica.getListaEstudiante();
    }
    
    @POST
    public Estudiante guardarEstudiante(Estudiante estudiante){
        
        estudiante.setId(estudianteLogica.getListaEstudiante().size() + 1);
        estudianteLogica.getListaEstudiante().add(estudiante);
        return estudiante;
    }
    
  
}
