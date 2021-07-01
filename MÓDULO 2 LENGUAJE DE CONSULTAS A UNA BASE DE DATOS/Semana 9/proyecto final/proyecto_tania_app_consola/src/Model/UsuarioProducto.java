package Model;

import java.util.ArrayList;

public class UsuarioProducto {

	private Usuario usuario;
    private ArrayList<Producto> productosDeseados;
    
	
    public UsuarioProducto() {
    }

    public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Producto> getProductosDeseados() {
		return productosDeseados;
	}
	public void setProductosDeseados(ArrayList<Producto> productosDeseados) {
		this.productosDeseados = productosDeseados;
	}



	
}
