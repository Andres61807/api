package tfg.proy.api.entity;

public class Libro {
    
    private String titulo;
    private String genero;
    private String autor;
    private String saga;
    private double precio;
    private boolean DRM;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getSaga() {
        return saga;
    }
    public void setSaga(String saga) {
        this.saga = saga;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isDRM() {
        return DRM;
    }
    public void setDRM(boolean dRM) {
        DRM = dRM;
    }
    
}
