package tfg.proy.api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {
    
    @Id
    @Column(name="ID_libro")
    private String id;
    private String titulo;
    @OneToMany(mappedBy="libro")
    private List<LibroGenero> generos;
    @OneToMany(mappedBy="libro")
    private List<LibroAutor> autores;
    @ManyToOne
    @JoinColumn(name="ID_saga")
    private Saga saga;
    @OneToMany(mappedBy="libro")
    private List<LibroIdioma> idiomas;
    private double precio;
    private int descuento;
    private boolean DRM;
    @Column(name="n_paginas")
    private int nPaginas;
    private String sinopsis;
    private Double valoracion;
    @Column(name="n_votos")
    private int nVotos;
    @Column(name="URLibro", unique = true)
    private String urlLibro;
    @Column(name="URLportada")
    private String urlPortada;
    @OneToMany(mappedBy = "libro")
    private List<LibroEditorial> editoriales;
    public Libro() {
    }  

    public Libro(String id, String titulo, List<LibroGenero> generos, List<LibroAutor> autores, Saga saga,
            List<LibroIdioma> idiomas, double precio, int descuento, boolean dRM, int nPaginas, String sinopsis,
            Double valoracion, int nVotos, String urlLibro, String urlPortada,List<LibroEditorial> editoriales) {
        this.id = id;
        this.titulo = titulo;
        this.generos = generos;
        this.autores = autores;
        this.saga = saga;
        this.idiomas = idiomas;
        this.precio = precio;
        this.descuento = descuento;
        DRM = dRM;
        this.nPaginas = nPaginas;
        this.sinopsis = sinopsis;
        this.valoracion = valoracion;
        this.nVotos = nVotos;
        this.urlLibro = urlLibro;
        this.urlPortada = urlPortada;
        this.editoriales=editoriales;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public List<LibroAutor> getAutores() {
        return autores;
    }
    public void setAutores(List<LibroAutor> autor) {
        this.autores = autor;
    }
    public Saga getSaga() {
        return saga;
    }
    public void setSaga(Saga saga) {
        this.saga = saga;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean getDRM() {
        return DRM;
    }
    public void setDRM(boolean dRM) {
        DRM = dRM;
    }
    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public int getnPaginas() {
        return nPaginas;
    }
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public Double getValoracion() {
        return valoracion;
    }
    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }
    public int getnVotos() {
        return nVotos;
    }
    public void setnVotos(int nVotos) {
        this.nVotos = nVotos;
    }
    public String getUrlLibro() {
        return urlLibro;
    }
    public void setUrlLibro(String urlLibro) {
        this.urlLibro = urlLibro;
    }
    public String getUrlPortada() {
        return urlPortada;
    }
    public void setUrlPortada(String urlPortada) {
        this.urlPortada = urlPortada;
    }

    public List<LibroGenero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<LibroGenero> generos) {
        this.generos = generos;
    }

    public List<LibroIdioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<LibroIdioma> idiomas) {
        this.idiomas = idiomas;
    }

    public List<LibroEditorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(List<LibroEditorial> editoriales) {
        this.editoriales = editoriales;
    }
    
}
