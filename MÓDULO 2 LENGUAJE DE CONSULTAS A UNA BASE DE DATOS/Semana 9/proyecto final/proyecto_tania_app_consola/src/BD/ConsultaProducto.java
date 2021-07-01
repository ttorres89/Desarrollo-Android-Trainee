package BD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import Model.Producto;
import Model.TipoProducto;

public class ConsultaProducto {
	
	public static Producto consultarProducto(String nombre)
	{
		Connection conexion = Conexion.conectar();
		Producto producto = null;
		TipoProducto tipoProducto = null;

		try
		{
			CallableStatement cs = conexion.prepareCall("{call sp_buscarProducto(?)}");
			cs.setString("in_nombre", nombre);

			ResultSet rs = cs.executeQuery();

			while (rs.next())
			{
				
				tipoProducto = new TipoProducto(rs.getString("nombreTipoProducto"));
				producto = new Producto(rs.getInt("codigo"), tipoProducto, rs.getString("nombre"), rs.getString("marca"),rs.getString("descripcion"), rs.getString("imagen"),   rs.getBoolean("estado"));
				
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return producto;
	}
	
	public static boolean IngresarProducto(int id_tipoProducto, String nombre, 	String marca, String descripcion)
	{
		Connection conexion = Conexion.conectar();


		try
		{
			CallableStatement cs = conexion.prepareCall("{call sp_ingresarProducto(?,?,?,?)}");
			cs.setInt("in_id_tipoProducto", id_tipoProducto);
			cs.setString("in_nombre", nombre);
			cs.setString("in_marca", marca);
			cs.setString("in_descripcion", descripcion);
			int resp = cs.executeUpdate();
	        if (resp > 0) 
	        {
	        	return true;
	        }		
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
