package Model;



public class Producto {
	
	private int codigo;

    private TipoProducto tipoProducto;

    private String nombre;

    private String marca;

    private String descripcion;

    private String imagen;

    private boolean estado;
    
    public Producto() {
    }
    
	public Producto(int codigo,TipoProducto tipoProducto, String nombre, String marca, String descripcion, String imagen, Boolean estado)
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.tipoProducto = tipoProducto;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
		
	}

    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}




}
