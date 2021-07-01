package Test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import BD.ConsultaUsuario;
import Model.Usuario;


class UsuarioTest {

	@Test
	void testRegistrarCuenta() {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Natali");
		usuario.setApellido("Torres");
		usuario.setRut("11111111-1");
		usuario.setEmail("n.torres@gmail.com");
		usuario.setClave("15523");
		
		boolean esperado = true;
		boolean resultado = ConsultaUsuario.registrarCuenta(usuario);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testListarCantidadUsuarios() {
		
		int esperado = 3;
		Map<Integer, Usuario> usuarios = ConsultaUsuario.CantidadUsuario();
		int resultado=usuarios.size();
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	void testListarUsuario() {
		
		String esperado = "Nombre: " + "Tania Alejandra" + 
				"\nApellido: " + "Torres"+
			   	"\nRut: " + "17307859-5" +
			   	"\nEmail: " + "torres.tania89@gmail.com";
		Usuario usuario = ConsultaUsuario.listarUsuario("torres.tania89@gmail.com");
		
		String resultado = "Nombre: " + usuario.getNombre()+ 
				"\nApellido: " + usuario.getApellido()+
			   	"\nRut: " + usuario.getRut() +
			   	"\nEmail: " + usuario.getEmail();

		assertEquals(esperado, resultado);
		
	}

	@Test
	void ModificarDatosUsuario() {
	
		Usuario usuario = new Usuario();
		usuario.setNombre("Tania Alejandra");
		usuario.setApellido("Torres");
		usuario.setRut("17307859-5");

		
		boolean esperado = true;
		boolean resultado = ConsultaUsuario.modificarUsuario(usuario.getNombre(), usuario.getApellido(), usuario.getRut(), "torres.tania89@gmail.com");
		assertEquals(esperado, resultado);
		
	}
}
