
package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Profesor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * 
 * @author Viviana Lizarazo
 */
@Stateless
public class ProfesorLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Profesor> getListaProfesor(){
        return almacenamiento.getListaProfesor();
    }
    //metodos    
    //nuevo profesor
    
    public Profesor nuevaFacultad(int id, String nombre, String apellido, int documento){
    return new Profesor(id, nombre, apellido, documento);
    }
    //editar Profesor
     public void editarProfesor(Profesor profesorAModif){
        for (Profesor profesor : almacenamiento.getListaProfesor()) {
            if(profesor.getId()==profesorAModif.getId()){
            almacenamiento.getListaProfesor().remove(profesor);
            almacenamiento.getListaProfesor().add(profesorAModif);
            break;
            }
            
        }
        
    }
    //eliminar Profesor
    public void eliminarProfesor(int id){
        for (Profesor profesor : almacenamiento.getListaProfesor()) {
            if(profesor.getId()==id){
           almacenamiento.getListaFacultad().remove(id);
           break;
            }
            
        }
    }
}
