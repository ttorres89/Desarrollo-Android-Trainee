package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BD.ConsultaProducto;
import BD.ConsultaUsuario;
import Model.Producto;
import Model.TipoProducto;
import Model.Usuario;

class ProductoTest {

	@Test
	void testIngresarProducto() {
		
		Producto producto = new Producto();
		TipoProducto tipoProducto = new TipoProducto(1);
		producto.setNombre("Pure Vitamin C10");
		producto.setMarca("LA ROCHE POSAY");
		producto.setTipoProducto(tipoProducto);
		producto.setDescripcion(" Pure Vitamin C10 Serum anti-arrugas, anti-oxidante y renovador que aporta luminosidad a la piel sensible");

		
		boolean esperado = true;
		boolean resultado = ConsultaProducto.IngresarProducto(producto.getTipoProducto().getCodigo(), producto.getNombre(),producto.getMarca(), producto.getDescripcion());
		assertEquals(esperado, resultado);
		
	}

}
