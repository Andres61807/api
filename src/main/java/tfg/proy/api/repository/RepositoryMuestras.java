package tfg.proy.api.repository;

import java.util.HashMap;
import java.util.Map;

import tfg.proy.api.entity.Libro;

public class RepositoryMuestras {
    private Map<Long, Libro> libors=new HashMap<>();

    private long GetIdConStreams() {
        long mayor = 
        libors
            .keySet()
            .stream()
            .max(
                (primero,segundo) -> (int) (segundo -  primero)
            )
            .get();
        return mayor+1;
    }
}
