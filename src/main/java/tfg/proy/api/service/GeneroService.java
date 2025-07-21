package tfg.proy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proy.api.entity.Genero;
import tfg.proy.api.repository.GeneroRepository;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> getAll(){
        return generoRepository.findAll();
    }

    public boolean get(String genero){
        Genero gen=generoRepository.findByGenero(genero);
        if(gen!=null){
            return true;
        }   
        return false;
    }
}
