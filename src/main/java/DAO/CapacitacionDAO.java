package DAO;

import java.sql.Date;
import java.sql.Time;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Capacitacion;

public class CapacitacionDAO {
	

	 private static CapacitacionDAO instancia;
	    private Connection conexion;
	    private CapacitacionDAO() {
	        // Establecer la conexión a la base de datos en el constructor privado
	        // Usar Singleton para asegurar que solo haya una instancia de CapacitacionDAO
	        // y una única conexión a la base de datos en todo el proyecto
	        conexion = obtenerConexion(); // Implementar este método
	    }

	    public static CapacitacionDAO getInstancia() {
	        if (instancia == null) {
	            instancia = new CapacitacionDAO();
	        }
	        return instancia;
	    }

	    // Métodos CRUD

	    public List<Capacitacion> obtenerCapacitaciones() {
	    	
	        List<Capacitacion> capacitaciones = new ArrayList<>();
	        String consulta = "SELECT * FROM capacitaciones";

	        try (
	        	 PreparedStatement statement = conexion.prepareStatement(consulta);
	        		
	             ResultSet resultSet = statement.executeQuery()) {

	            while (resultSet.next()) {
	                Capacitacion capacitacion = new Capacitacion();
	                capacitacion.setIdCapacitacion(resultSet.getString("idCapacitacion"));
	                capacitacion.setRutCliente(resultSet.getString("rutCliente"));
	                capacitacion.setDia(resultSet.getString("dia"));
	                capacitacion.setFecha(resultSet.getDate("fecha").toLocalDate());
	                capacitacion.setHora(resultSet.getTime("hora").toLocalTime());
	                capacitacion.setLugar(resultSet.getString("lugar"));
	                capacitacion.setDuracion(resultSet.getFloat("duracion"));
	                capacitacion.setAsistentes(resultSet.getInt("asistentes"));
	                capacitaciones.add(capacitacion);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return capacitaciones;
	    }

	    public Capacitacion obtenerCapacitacionPorId(String idCapacitacion) {
	        Capacitacion capacitacion = null;
	        String consulta = "SELECT * FROM capacitaciones WHERE idCapacitacion = ?";
	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	        	statement.setString(1, idCapacitacion);

	            try (ResultSet result = statement.executeQuery()) {
	                if (result.next()) {
	                	capacitacion = new Capacitacion();
	                    capacitacion.setIdCapacitacion(result.getString("idCapacitacion"));
	                    capacitacion.setRutCliente(result.getString("rutCliente"));
	                    capacitacion.setDia(result.getString("dia"));
	                    capacitacion.setFecha(result.getDate("fecha").toLocalDate());
	                    capacitacion.setHora(result.getTime("hora").toLocalTime());
	                    capacitacion.setLugar(result.getString("lugar"));
	                    capacitacion.setDuracion(result.getFloat("duracion"));
	                    capacitacion.setAsistentes(result.getInt("asistentes"));
	           
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return capacitacion;
	    }

	    public void agregarCapacitacion(Capacitacion capacitacion) {
	        String consulta ="INSERT INTO capacitaciones ( idCapacitacion, rutCliente, dia, fecha, hora, lugar,duracion, asistentes) " + "VALUES (?,?, ?, ?, ?, ?, ?, ?)";

	        try (
	        		
	        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
	        	 statement.setString(1, capacitacion.getIdCapacitacion());
	             statement.setString(2, capacitacion.getRutCliente());
	             statement.setString(3, capacitacion.getDia());
	             statement.setDate(4, java.sql.Date.valueOf(capacitacion.getFecha()));
	             statement.setTime(5, java.sql.Time.valueOf(capacitacion.getHora()));
	             statement.setString(6, capacitacion.getLugar());
	             statement.setFloat(7, capacitacion.getDuracion());
	             statement.setInt(8, capacitacion.getAsistentes());
	    
	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void actualizarCapacitacion(Capacitacion capacitacion) {
	    	 String consulta = "UPDATE capacitacion SET rutCliente = ?, dia = ?, fecha = ?, hora = ?, lugar = ?, duracion = ?, asistentes = ? "+ "WHERE idCapacitacion = ?";

	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	        	 statement.setString(1, capacitacion.getRutCliente());
	             statement.setString(2, capacitacion.getDia());
	             statement.setDate(3, java.sql.Date.valueOf(capacitacion.getFecha()));
	             statement.setTime(4, java.sql.Time.valueOf(capacitacion.getHora()));
	             statement.setString(5, capacitacion.getLugar());
	             statement.setFloat(6, capacitacion.getDuracion());
	             statement.setInt(7, capacitacion.getAsistentes());
	             statement.setString(8, capacitacion.getIdCapacitacion());
	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void eliminarCapacitacion(String idCapacitacion) {
	    	String consulta = "DELETE FROM capacitacion WHERE idCapacitacion = ?";

	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	        	statement.setString(1, idCapacitacion);
	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	   

	    private Connection obtenerConexion() {
	        Connection conexion = null;

	        try {
	        	 // Establecer la conexión
	            Class.forName("com.mysql.jdbc.Driver");

	            // Establecer los detalles de la conexión
	            String url = "jdbc:mysql://localhost:3306/grupal5";
	            String usuario = "root";
	            String password = "admin";

	           
	            conexion = DriverManager.getConnection(url, usuario, password);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return conexion;
	    }
}
