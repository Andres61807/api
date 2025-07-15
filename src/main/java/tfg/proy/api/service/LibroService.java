package tfg.proy.api.service;

import java.util.ArrayList;
import java.util.List;

import tfg.proy.api.entity.Libro;

public class LibroService {
    //TODO - añadir repostiorio

    //GET
    public List<Libro> getAll(){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        

        return libros;
    }   
    
    public List<Libro> getGenero(String a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        return libros;
    }

     public List<Libro> getAutor(String a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        return libros;
    }

     public List<Libro> getSaga(String a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        return libros;
    }

    public Libro get(int id){
        //TODO - añadir logica correcta
        Libro lib=new Libro();
        return lib;
    }

    //POST
    public Libro create(Libro libro){
        return new Libro();
    }

    //PUT 
    public void update(){
        //TODO - añadir logica
    }

    //DELETE
    public void delete(){
        //TODO - añadir logica
    }
}
