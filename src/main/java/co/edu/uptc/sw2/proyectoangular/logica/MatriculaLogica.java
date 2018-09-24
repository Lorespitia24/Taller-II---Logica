/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Estudiante;
import co.edu.uptc.sw2.proyectoangular.objetos.Materia;
import co.edu.uptc.sw2.proyectoangular.objetos.Matricula;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Lorespitia_24
 */
@Stateless
public class MatriculaLogica {
      @EJB
    public Almacenamiento almacenamiento;
    
    public List<Matricula> getListaMatricula(){
        return almacenamiento.getListaMatricula();
    }
    
     //nuevo Materia
    public Matricula nuevoMatricula(int id, int year, int semestre, Estudiante estudiante, Materia materia){
    return new Matricula(id, id, id, estudiante, materia);
    }
    
    //editar Materia
    public void editarMatricula(Matricula matriculaEdit){
        for (Matricula matricula : almacenamiento.getListaMatricula()) {
            if(matricula.getId()==matriculaEdit.getId()){
            almacenamiento.getListaMatricula().remove(matricula);
            almacenamiento.getListaMatricula().add(matriculaEdit);
            break;
            }
            
        }
        
    }
    //eliminar Matricula
    public void eliminarMatricula(int id){
        for (Matricula matricula : almacenamiento.getListaMatricula()) {
            if(matricula.getId()==id){
           almacenamiento.getListaMatricula().remove(id);
           break;
            }
            
        }
    }
}
