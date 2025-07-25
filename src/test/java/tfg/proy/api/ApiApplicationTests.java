package tfg.proy.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tfg.proy.api.entity.Autor;
import tfg.proy.api.entity.Editorial;
import tfg.proy.api.repository.AutorRepository;
import tfg.proy.api.repository.EditorialRepository;
import tfg.proy.api.service.LibroService;

@SpringBootTest
class ApiApplicationTests {

	// @Test
	// void contextLoads() {
	// }

	// @Autowired
	// private LibroService libroService;
	// @Autowired
	// private EditorialRepository editorialRepository;
	// @Test
	// void pruebaAutor(){
	// 	Editorial editorial=editorialRepository.findByNombre("Libros del Sur");
	// 	assertNotNull(editorial);
	// }
}
