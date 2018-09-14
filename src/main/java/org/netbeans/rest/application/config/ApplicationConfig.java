/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author RA302
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioCarrera.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioEjemplo.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioEstudiante.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioFacultad.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioHorario.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioMateria.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioMatricula.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioMunicipio.class);
        resources.add(co.edu.uptc.sw2.proyectoangular.servicios.ServicioProfesor.class);
    }
    
}
