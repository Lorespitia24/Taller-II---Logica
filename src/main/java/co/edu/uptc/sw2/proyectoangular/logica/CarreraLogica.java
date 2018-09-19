/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Carrera;
import co.edu.uptc.sw2.proyectoangular.objetos.Facultad;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class CarreraLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Carrera> getListaCarrera(){
        return almacenamiento.getListaCarrera();
    }
        public Carrera nuevaCarrera(int id, String nombre,Facultad facultad){
    return new Carrera(id, nombre,facultad);
    }
    public void editarCarrera(Carrera carreraAModif){
        for (Carrera carrera : almacenamiento.getListaCarrera()) {
            if(carrera.getId()==carreraAModif.getId()){
            almacenamiento.getListaCarrera().remove(carrera);
            almacenamiento.getListaCarrera().add(carreraAModif);
            break;
            }
            
        }
        
    }
    public void eliminarCarrera(int id){
        for (Carrera carrera : almacenamiento.getListaCarrera()) {
            if(carrera.getId()==id){
           almacenamiento.getListaCarrera().remove(id);
           break;
            }
            
        }
    }
}
