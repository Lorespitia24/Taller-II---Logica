/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.logica;

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
}
