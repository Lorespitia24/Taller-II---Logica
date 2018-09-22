package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Municipio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * 
 * @author Viviana Lizarazo
 */
@Stateless
public class MunicipioLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Municipio> getListaMunicipio(){
        return almacenamiento.getListaMunicipio();
    }
    //metodos
    
    //nuevo municipio
    public Municipio nuevoMunicipio(int id, String nombre){
    return new Municipio(id, nombre);
    }
    //editar municipio
     public void editarMunicipio(Municipio municipioAModif){
        for (Municipio facultad : almacenamiento.getListaMunicipio()) {
            if(facultad.getId()==municipioAModif.getId()){
            almacenamiento.getListaMunicipio().remove(facultad);
            almacenamiento.getListaMunicipio().add(municipioAModif);
            break;
            }
            
        }
        
    }    
    //eliminar municipio
         public void eliminarMunicipio(int id){
        for (Municipio municipio : almacenamiento.getListaMunicipio()) {
            if(municipio.getId()==id){
           almacenamiento.getListaMunicipio().remove(id);
           break;
            }
            
        }
    }
}
