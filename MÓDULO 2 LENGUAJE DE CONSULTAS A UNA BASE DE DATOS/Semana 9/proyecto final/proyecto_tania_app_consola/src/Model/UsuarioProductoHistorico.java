package Model;

import java.util.Date;

public class UsuarioProductoHistorico {
    
	
	private Usuario usuario;
    private ProductoDetalle producto_detalle;
    private int precio;
    private Date fecha;
    
    
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ProductoDetalle getProducto_detalle() {
		return producto_detalle;
	}

	public void setProducto_detalle(ProductoDetalle producto_detalle) {
		this.producto_detalle = producto_detalle;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



    public UsuarioProductoHistorico() {
    }


}
