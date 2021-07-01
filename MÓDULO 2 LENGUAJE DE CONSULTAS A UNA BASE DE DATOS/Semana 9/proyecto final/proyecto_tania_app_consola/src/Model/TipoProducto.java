package Model;

import java.util.Date;

public class TipoProducto {

	private int codigo;
    private String nombre;
    private Date fecha_creacion;
    
    public TipoProducto(int codigo, String nombre) {
    	this.codigo=codigo;
    	this.nombre=nombre;
    }
    
    public TipoProducto(int codigo) {
    	this.codigo=codigo;
    }
    
    public TipoProducto(String nombre) {
    	this.nombre=nombre;
    }

    public TipoProducto() {
    }
    
    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


    
}
