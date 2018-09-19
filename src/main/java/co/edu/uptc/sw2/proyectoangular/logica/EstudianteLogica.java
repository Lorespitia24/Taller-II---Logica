package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Estudiante;
import co.edu.uptc.sw2.proyectoangular.objetos.Matricula;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class EstudianteLogica {
    @EJB
    public Almacenamiento almacenamiento;
    
    public List<Estudiante> getListaEstudiante(){
        return almacenamiento.getListaEstudiante();
    }
    public Estudiante nuevoEstudiante(int id, String nombre,String correo,String curso,Matricula matricula){
    return new Estudiante(id, nombre, correo, curso, matricula);
    }
    public void editarEstudiante(Estudiante estudianteAModif){
        for (Estudiante estudiante : almacenamiento.getListaEstudiante()) {
            if(estudiante.getId()==estudianteAModif.getId()){
            almacenamiento.getListaEstudiante().remove(estudiante);
            almacenamiento.getListaEstudiante().add(estudianteAModif);
            break;
            }
            
        }
        
    }
    public void eliminarEstudiante(int id){
        for (Estudiante estudiante : almacenamiento.getListaEstudiante()) {
            if(estudiante.getId()==id){
           almacenamiento.getListaEstudiante().remove(id);
           break;
            }
            
        }
    }
}
