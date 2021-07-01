package BD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import Model.Usuario;


public class ConsultaUsuario {
	

	public static boolean registrarCuenta(Usuario usuario)
	{
		Connection conexion = Conexion.conectar();

		try
		{
			CallableStatement cs = conexion.prepareCall("{call sp_ingresarUsuario(?,?,?,?,?)}");
			cs.setString("in_nombre", usuario.getNombre());
			cs.setString("in_apellido", usuario.getApellido());
			cs.setString("in_rut", usuario.getRut());
			cs.setString("in_email", usuario.getEmail());
			cs.setString("in_clave", usuario.getClave());
			cs.executeQuery();
			return true;
		}
		catch (SQLException e)
		
		{
			e.printStackTrace();
		}
		return false;
	}

	
	public static Map<Integer, Usuario> CantidadUsuario()
	{
		Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>(); 
		int contador=0;
		Connection conexion = Conexion.conectar();

		try
		{
			CallableStatement cs = conexion.prepareCall("{call listarUsuarios()}");
			cs.executeQuery();
			ResultSet rs = cs.executeQuery();
			while(rs.next())
			{	contador+=1;
				Usuario usuario = new Usuario(
						rs.getString("nombre"),
						rs.getString("apellido"),
						rs.getString("rut"),
						rs.getString("email")
						);
				usuarios.put(contador, usuario);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return usuarios;
	}
	
	public static Usuario listarUsuario(String email)
	{
		Connection conexion = Conexion.conectar();
		Usuario usuario=null;;

		try
		{
			CallableStatement cs = conexion.prepareCall("{call listarUsuario(?)}");
			cs.setString("in_email", email);
			cs.executeQuery();
			ResultSet rs = cs.executeQuery();
			while(rs.next())
			{	
				usuario = new Usuario (
						rs.getString("nombre"),
						rs.getString("apellido"),
						rs.getString("rut"),
						rs.getString("email")
						);
				
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return usuario;
	}

	public static boolean modificarUsuario(String nombre, String apellido, String rut, String email)
	{
		Connection conexion = Conexion.conectar();

		try
		{
			CallableStatement cs = conexion.prepareCall("{call sp_modificarUsuario(?,?,?,?)}");
			cs.setString("in_nombre", nombre);
			cs.setString("in_apellido", apellido);
			cs.setString("in_rut", rut);
			cs.setString("in_email", email);
			cs.executeQuery();
			return true;
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
