package co.edu.uptc.sw2.proyectoangular.logica;

import co.edu.uptc.sw2.proyectoangular.objetos.Carrera;
import co.edu.uptc.sw2.proyectoangular.objetos.Estudiante;
import co.edu.uptc.sw2.proyectoangular.objetos.Facultad;
import co.edu.uptc.sw2.proyectoangular.objetos.Horario;
import co.edu.uptc.sw2.proyectoangular.objetos.Materia;
import co.edu.uptc.sw2.proyectoangular.objetos.Matricula;
import co.edu.uptc.sw2.proyectoangular.objetos.Municipio;
import co.edu.uptc.sw2.proyectoangular.objetos.Profesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author RA302
 */
@Singleton
public class Almacenamiento {

    private static final Almacenamiento instancia = new Almacenamiento();
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    private List<Carrera> listaCarrera = new ArrayList<Carrera>();
    private List<Facultad> listaFacultad = new ArrayList<Facultad>();
    private List<Profesor> listaProfesor = new ArrayList<Profesor>();
    private List<Horario> listaHorario= new ArrayList<Horario>();
    private List<Materia> listaMateria = new ArrayList<Materia>();
    
    private List<Municipio> listaMunicipio = new ArrayList<Municipio>();
    private List<Matricula> listaMatricula = new ArrayList<Matricula>();
    
 
  @PostConstruct
    private void Almacenamiento() {
        //lista estudiantes
        Estudiante e1 = new Estudiante(3, "pepito", "a@a.com", "ing software", null);
        Estudiante e2 = new Estudiante(1, "Juan", "a@a.com", "ing software", null);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(new Estudiante(2, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(3, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(4, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(5, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(6, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(e1);
        
        //lista profesores
        Profesor p1=new Profesor(1, "Felipe", "Gonzales", 0);
        Profesor p2=new Profesor(2, "Andres", "Gonzales", 1);
        listaProfesor.add(p1);
        listaProfesor.add(p2);
        
        //lista facultad
        Facultad facultad=new Facultad(1, "Salud");
        Facultad facultad1=new Facultad(2, "Ingenieria");
        listaFacultad.add(facultad);
        listaFacultad.add(facultad1);
        
        //lista carrera
        Carrera c1=new Carrera(1, "Sistemas", facultad1);
                Carrera c2=new Carrera(1, "Medicina", facultad);
        listaCarrera.add(c1);
        listaCarrera.add(c2);
        
        //lista municipio
        listaMunicipio.add(new Municipio(1, "Paz del Rio"));
        listaMunicipio.add(new Municipio(2, "Villa de Leyva"));
        listaMunicipio.add(new Municipio(3, "Tibana"));
        
        //lista materias
        Date d1=new Date();
        Materia materia1 = new Materia(1, "Calculo", 2,c1,p1,
                
                new Horario(1,"Lunes",d1,d1));
         Materia materia2 = new Materia(2, "Fisica", 8,c2,p2,
                new Horario(1,"Martes",new Date(),new Date()));
        listaMateria.add(materia1);
        listaMateria.add(materia2);
        //horarios
        
        
        listaMatricula.add(new Matricula(1, 2017, 2, e1, materia1));
        listaMatricula.add(new Matricula(1, 2017, 2, e2, materia1));
                       
    }

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiantes;
    }

    public List<Facultad> getListaFacultad() {
        return listaFacultad;
    }

    public void setListaFacultad(List<Facultad> listaFacultad) {
        this.listaFacultad = listaFacultad;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Carrera> getListaCarrera() {
        return listaCarrera;
    }

    public void setListaCarrera(List<Carrera> listaCarrera) {
        this.listaCarrera = listaCarrera;
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public List<Horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public List<Municipio> getListaMunicipio() {
        return listaMunicipio;
    }

    public void setListaMunicipio(List<Municipio> listaMunicipio) {
        this.listaMunicipio = listaMunicipio;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

   

}
