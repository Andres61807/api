package tfg.proy.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LibroIdiomaId implements Serializable{

    @Column(name="ID_libro")
    private String libroId;
    @Column(name="ID_idioma")
    private Long idiomaId;
    
    public LibroIdiomaId() {
    }
    public LibroIdiomaId(String libro, Long idiomaId) {
        this.libroId = libro;
        this.idiomaId = idiomaId;
    }

    public String getLibro() {
        return libroId;
    }
    public void setLibro(String libro) {
        this.libroId = libro;
    }
    public Long getIdiomaId() {
        return idiomaId;
    }
    public void setIdiomaId(Long idiomaId) {
        this.idiomaId = idiomaId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((libroId == null) ? 0 : libroId.hashCode());
        result = prime * result + ((idiomaId == null) ? 0 : idiomaId.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LibroIdiomaId other = (LibroIdiomaId) obj;
        if (libroId == null) {
            if (other.libroId != null)
                return false;
        } else if (!libroId.equals(other.libroId))
            return false;
        if (idiomaId == null) {
            if (other.idiomaId != null)
                return false;
        } else if (!idiomaId.equals(other.idiomaId))
            return false; 
        return true;
    }  

    
}
