package tfg.proy.api.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Biblioteca;
import tfg.proy.api.entity.Libro;
import tfg.proy.api.entity.LibroBiblioteca;
import tfg.proy.api.entity.LibroBibliotecaId;
import tfg.proy.api.repository.BibliotecaRepository;
import tfg.proy.api.repository.LibroBibliotecaRepository;
import tfg.proy.api.repository.LibroRepository;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;
    @Autowired 
    private LibroRepository libroRepository;
    @Autowired
    private LibroBibliotecaRepository libroBibliotecaRepository;
    
    public void addLibro(Long idBilioteca,Long idLibro){
        LibroBibliotecaId id=new LibroBibliotecaId();
        id.setLibroId(idLibro);
        id.setBibliotecaId(idBilioteca);    
        
        Libro libro=libroRepository.findById(idLibro).orElse(null);
        Biblioteca biblioteca=bibliotecaRepository.findById(idBilioteca).orElse(null);

        LibroBiblioteca libroBiblioteca=new LibroBiblioteca();
        libroBiblioteca.setLibroBibliotecaId(id);
        libroBiblioteca.setBiblioteca(biblioteca);        
        libroBiblioteca.setLibro(libro);

        double precioCompra=libro.getPrecio()*(libro.getDescuento()/100);
        libroBiblioteca.setPrecioCompra(precioCompra);
        
        LocalDate fechaActual=LocalDate.now();
        libroBiblioteca.setFechaCompra(fechaActual);
        
        libroBibliotecaRepository.save(libroBiblioteca);
    }
}
