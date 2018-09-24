/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Carrera;
import co.edu.uptc.sw2.proyectoangular.objetos.Horario;
import co.edu.uptc.sw2.proyectoangular.objetos.Materia;
import co.edu.uptc.sw2.proyectoangular.objetos.Profesor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class MateriaLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Materia> getListaMateria(){
        return almacenamiento.getListaMateria();
    }
    
    //nuevo Materia
    public Materia nuevoMateria(int id, String nombre,int creditos,Carrera carrera,Profesor profesor,Horario horario){
    return new Materia(id, nombre, creditos, carrera, profesor, horario);
    }
    
    //editar Materia
    public void editarMateria(Materia materiaEdit){
        for (Materia materia : almacenamiento.getListaMateria()) {
            if(materia.getId()==materiaEdit.getId()){
            almacenamiento.getListaMateria().remove(materia);
            almacenamiento.getListaMateria().add(materiaEdit);
            break;
            }
            
        }
        
    }
    //eliminar Materia
    public void eliminarMateria(int id){
        for (Materia materia : almacenamiento.getListaMateria()) {
            if(materia.getId()==id){
           almacenamiento.getListaMateria().remove(id);
           break;
            }
            
        }
    }
}
