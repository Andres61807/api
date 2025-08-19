package tfg.proy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tfg.proy.api.service.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;
   

    @PostMapping("/comprar")
    public void addLibro(@RequestParam Long idBiblioteca,@RequestParam Long idLibro){
        bibliotecaService.addLibro(idBiblioteca,idLibro);
    }
}
