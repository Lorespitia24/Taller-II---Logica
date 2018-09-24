/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Horario;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class HorarioLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Horario> getListaHorario(){
        return almacenamiento.getListaHorario();
    }
    
     //nuevo Materia
    public Horario nuevoHorario(int id, String dia,Date horaInicio, Date horaFin){
    return new Horario(id, dia, horaInicio, horaFin);
    }
    
    //editar Materia
    public void editarHorario(Horario horarioEdit){
        for (Horario horario : almacenamiento.getListaHorario()) {
            if(horario.getId()==horarioEdit.getId()){
            almacenamiento.getListaHorario().remove(horario);
            almacenamiento.getListaHorario().add(horarioEdit);
            break;
            }
            
        }
        
    }
    //eliminar Horario
    public void eliminarHorario(int id){
        for (Horario horario : almacenamiento.getListaHorario()) {
            if(horario.getId()==id){
           almacenamiento.getListaHorario().remove(id);
           break;
            }
            
        }
    }
    
}
