package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Facultad;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class FacultadLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Facultad> getListaFacultad(){
        return almacenamiento.getListaFacultad();
    }
    
    public Facultad nuevaFacultad(int id, String nombre){
    return new Facultad(id, nombre);
    }
    public void editarFacultad(Facultad facultadAModif){
        for (Facultad facultad : almacenamiento.getListaFacultad()) {
            if(facultad.getId()==facultadAModif.getId()){
            almacenamiento.getListaFacultad().remove(facultad);
            almacenamiento.getListaFacultad().add(facultadAModif);
            break;
            }
            
        }
        
    }
    public void eliminarFacultad(int id){
        for (Facultad facultad : almacenamiento.getListaFacultad()) {
            if(facultad.getId()==id){
           almacenamiento.getListaFacultad().remove(id);
           break;
            }
            
        }
    }
    
}
