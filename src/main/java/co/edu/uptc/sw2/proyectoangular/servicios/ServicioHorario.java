/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.servicios;

import co.edu.uptc.sw2.proyectoangular.logica.HorarioLogica;
import co.edu.uptc.sw2.proyectoangular.objetos.Horario;
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

@Path("ServicioHorario")
@Stateless
public class ServicioHorario {
        @EJB
    private HorarioLogica horarioLogica;
    
    @GET
    public List<Horario> consultarHorario(){
        return horarioLogica.getListaHorario();
    }
    
    @POST
    public Horario guardarEstudiante(Horario horario){
        
        horario.setId(horarioLogica.getListaHorario().size() + 1);
        horarioLogica.getListaHorario().add(horario);
        return horario;
    }
    
  
}
