package tfg.proy.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Genero;
import tfg.proy.api.entity.Libro;


@Service
public class LibroService {
    
    //GET
    public List<Libro> getAll(){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        Libro lib1=new Libro();
        lib1.setId(1);
        Libro lib2=new Libro();
        lib1.setId(2);
        Libro lib3=new Libro();
        lib1.setId(3);

        libros.add(lib1);
        libros.add(lib2);
        libros.add(lib3);
        return libros;
    }   
    
    public List<Libro> getGenero(Genero [] a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        Libro lib1=new Libro();
        lib1.setId(1);
        Libro lib2=new Libro();
        lib2.setId(2);
        Libro lib3=new Libro();
        lib3.setId(3);

        libros.add(lib1);
        libros.add(lib2);
        libros.add(lib3);
        return libros;
    }

    public List<Libro> getAutor(Autor [] a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        Libro lib1=new Libro();
        lib1.setId(1);
        Libro lib2=new Libro();
        lib2.setId(2);
        Libro lib3=new Libro();
        lib3.setId(3);

        libros.add(lib1);
        libros.add(lib2);
        libros.add(lib3);
        return libros;
    }

    public List<Libro> getSaga(String a){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        Libro lib1=new Libro();
        lib1.setId(1);
        Libro lib2=new Libro();
        lib2.setId(2);
        Libro lib3=new Libro();
        lib3.setId(3);

        libros.add(lib1);
        libros.add(lib2);
        libros.add(lib3);
        return libros;
    }

    public Libro get(int id){
        //TODO - añadir logica correcta
        Libro lib=new Libro();
        return lib;
    }

    public List<Libro> getPrecio(double precio){
        //TODO - añadir logica correcta
        List<Libro> libros=new ArrayList<>();
        Libro lib1=new Libro();
        lib1.setId(1);
        Libro lib2=new Libro();
        lib2.setId(2);
        Libro lib3=new Libro();
        lib3.setId(3);

        libros.add(lib1);
        libros.add(lib2);
        libros.add(lib3);
        return libros;
    }

    //POST
    public Libro create(Libro libro){
        return new Libro();
    }

    //PUT 
    public void update(Libro lib){
        //TODO - añadir logica
    }

    //DELETE
    public void delete(Libro lib){
        //TODO - añadir logica
    }
}
