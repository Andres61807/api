package tfg.proy.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;

import tfg.proy.api.entity.Usuario;
import tfg.proy.api.repository.UsuarioRepository;;

@SpringBootTest
@AutoConfigureMockMvc
class ApiApplicationTests {

	@Autowired 
	private UsuarioRepository usuarioRepository;
	@Autowired 
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
	
	@Test
	void testUsuario() throws Exception{
		Usuario nuevoUsuario=new Usuario();
		nuevoUsuario.setApellidos("apellidosTest");
		nuevoUsuario.setCorreo("correoTest");
		nuevoUsuario.setNombre("nombreTest");	


		Usuario usuarioGuardado=usuarioRepository.save(nuevoUsuario);
		
		MvcResult mvcResult=mockMvc.perform(get("/usuario/"+usuarioGuardado.getId().toString()))
            .andDo(print())
            .andExpect(status().isOk())
            .andReturn();

		Usuario usuarioComprobacion=objectMapper.readValue(mvcResult.getResponse().getContentAsString(),Usuario.class);
		Usuario usuarioComprobacionDB=usuarioRepository.findById(usuarioComprobacion.getId()).orElse(null);

		assertTrue(usuarioComprobacion!=null);
		assertEquals(usuarioComprobacion.getCorreo(), usuarioComprobacion.getCorreo());
        
		assertEquals(usuarioComprobacion.getId(), usuarioComprobacionDB.getId());
	}
}
