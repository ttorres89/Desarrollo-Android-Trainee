package Model;

import java.util.Date;

public class Usuario {

	private int id;
    private String nombre;
    private String apellido;
    private String rut;
    private String email;
    private String clave;
    private Date fecha_creacion;
    private Date fecha_modificacion;
	
    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, String rut, String email) {
    	this.nombre=nombre;
    	this.apellido=apellido;
    	this.rut=rut;
    	this.email=email;
    }
    
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}


	public String mostrarDatos()
	{
		return	"Nombre: " + this.nombre + 
				"\nApellido: " + this.apellido +
			   	"\nRut: " + this.rut +
			   	"\nEmail: " + this.email;
	}
	






    

	
}
