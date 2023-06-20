package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import modelo.Usuario;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Administrativo;

public class UsuarioDAO {
	

	 private static UsuarioDAO instancia;
	    private Connection conexion;
	    private UsuarioDAO() {
	        conexion = obtenerConexion();
	    }

	    public static UsuarioDAO getInstancia() {
	        if (instancia == null) {
	            instancia = new UsuarioDAO();
	        }
	        return instancia;
	    }

	    // Métodos CRUD

		// [Create]RUD
		public void crearUsuario(Usuario u){
			// 1. defino tipo de usuario con getSimpleName (en base a constructor)
			// 2. defino los 3 tipo de query INSERT...
			// 3. en bloque try/catch:
			// 3.1. switch sobre tipoUsuario y para cada caso:
			// 3.1.1. abre conexion
			// 3.1.2. setea campos correctos segun schema
			// 3.1.3. ejecuta query
			String tipoUsuario = u.getClass().getSimpleName();
			String insertCliente = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, telefono, direccion, comuna, afp, sistemaSalud,	edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			String insertProfesional = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, titulo, fechaIngreso) VALUES (?, ?, ?, ?, ?, ?, ?);";
			String insertAdministrativo = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, area, expPrevia) VALUES (?, ?, ?, ?, ?, ?, ?);";
			try {
				
				if (tipoUsuario.equals("Cliente")) {
					Cliente c = (Cliente) u;	
					PreparedStatement statement = conexion.prepareStatement(insertCliente);
					statement.setString(1, c.getRut());
					statement.setString(2, c.getNombres());
					statement.setString(3, c.getApellidos());
					statement.setDate(4, Date.valueOf(c.getFechaNacimiento()));
					statement.setString(5, "cliente");
					statement.setString(6, c.getTelefono());
					statement.setString(7, c.getDireccion());
					statement.setString(8, c.getComuna());
					statement.setString(9, c.getAfp());
					statement.setString(10, c.getSistemaSalud());
					statement.setInt(11, c.getEdad());
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");
				
				} else if (tipoUsuario.equals("Profesional")) {
					Profesional p = (Profesional) u;
					PreparedStatement statement = conexion.prepareStatement(insertProfesional);
					statement.setString(1, p.getRut());
					statement.setString(2, p.getNombres());
					statement.setString(3, p.getApellidos());
					statement.setDate(4, Date.valueOf(p.getFechaNacimiento()));
					statement.setString(5, "profesional");
					statement.setString(6, p.getTitulo());
					statement.setDate(7, Date.valueOf(p.getFechaIngreso()));
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");

				} else if (tipoUsuario.equals("Administrativo")) {
					Administrativo a = (Administrativo) u;
					PreparedStatement statement = conexion.prepareStatement(insertAdministrativo);
					statement.setString(1, a.getRut());
					statement.setString(2, a.getNombres());
					statement.setString(3, a.getApellidos());
					statement.setDate(4, Date.valueOf(a.getFechaNacimiento()));
					statement.setString(5, "administrativo");
					statement.setString(6, a.getArea());
					statement.setString(7, a.getExpPrevia());
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");
				}
				
			} catch (SQLException e){
				System.out.println("Ups, hubo un problemita con nuestra BD. Vuelva otro día, gracias :P");
				e.printStackTrace();
			}
		}

		
		// C[Read]UD
	    public List<Usuario> obtenerUsuarios() {
	    	
	        List<Usuario> usuarios = new ArrayList<>();
	        String consulta = "SELECT * FROM usuario";

	        try (
	        	 PreparedStatement statement = conexion.prepareStatement(consulta);
	        		
	             ResultSet resultSet = statement.executeQuery()) {

	            while (resultSet.next()) {
					// 1. resultSet.getString("tipoUsuario") asigno a variable
					// 2. switch case: cliente, profesional, administrativo
					// 2.1 caso cliente Cliente u = new Cliente(rut, nombres, apellidos, fechaNacimiento, telefono, direccion, comuna, afp, sistemaSalud, edad)
					// 2.2 caso profesional Profesional u = new Profesional(rut, nombres, apellidos, fechaNacimiento, fechaIngreso, titulo)
					// 2.3 caso admin Administrativo u = new Administrativo(rut, nombres, apellidos, fechaNacimiento, area, expPrevia)
					// 3. usuarios.add(u)
					// 4. retornar usuarios
					String tipoUsuario = resultSet.getString("tipoUsuario");

					switch (tipoUsuario){
						case "cliente":
							Cliente u = new Cliente();
							u.setRut(resultSet.getString("rut"));
							u.setNombres(resultSet.getString("nombres"));
							u.setApellidos(resultSet.getString("apellidos"));
							u.setFechaNacimiento(LocalDate.parse(resultSet.getString("fechaNacimiento")));
							u.setTelefono(resultSet.getString("telefono"));
							u.setDireccion(resultSet.getString("direccion"));
							u.setComuna(resultSet.getString("comuna"));
							u.setAfp(resultSet.getString("afp"));
							u.setSistemaSalud(resultSet.getString("sistemaSalud"));
							u.setEdad(resultSet.getInt("edad"));
							usuarios.add(u);
							break;
						case "profesional":
							Profesional p = new Profesional();
							p.setRut(resultSet.getString("rut"));
							p.setNombres(resultSet.getString("nombres"));
							p.setApellidos(resultSet.getString("apellidos"));
							p.setFechaNacimiento(LocalDate.parse(resultSet.getString("fechaNacimiento")));
							p.setTitulo(resultSet.getString("titulo"));
							p.setFechaIngreso(LocalDate.parse(resultSet.getString("fechaIngreso")));
							usuarios.add(p);
							break;
						case "administrativo":
							Administrativo a = new Administrativo();
							a.setRut(resultSet.getString("rut"));
							a.setNombres(resultSet.getString("nombres"));
							a.setApellidos(resultSet.getString("apellidos"));
							a.setFechaNacimiento(LocalDate.parse(resultSet.getString("fechaNacimiento")));
							a.setArea(resultSet.getString("area"));
							a.setExpPrevia(resultSet.getString("expPrevia"));
							usuarios.add(a);
							break;
						default:
							break;
					}
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return usuarios;
	    }
/*
		
	    public Usuario obtenerUsuarioPorId(String idUsuario) {
	        Usuario Usuario = null;
	        String consulta = "SELECT * FROM Usuarios WHERE id = ?";
	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	        	statement.setString(1, idUsuario);

	            try (ResultSet result = statement.executeQuery()) {
	                if (result.next()) {
	                	Usuario = new Usuario();
	                	Usuario.setIdUsuario(result.getInt("idUsuario"));
	          
	           
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return Usuario;
	    }

	    public void agregarUsuario(Usuario Usuario) {
	        String consulta ="INSERT INTO Usuarios ( rutCliente, dia, fecha, hora, lugar,duracion, asistentes) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";

	        try (
	        		
	        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
	             statement.setString(1, Usuario.getRutCliente());

	    
	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }*/

		// CR[Update]D
		public void actualizarUsuario(int id){
			// 1. defino tipo de usuario con getSimpleName (en base a constructor)
			// 2. defino los 3 tipo de query INSERT...
			// 3. en bloque try/catch:
			// 3.1. switch sobre tipoUsuario y para cada caso:
			// 3.1.1. abre conexion
			// 3.1.2. setea campos correctos segun schema
			// 3.1.3. ejecuta query
			String tipoUsuario = u.getClass().getSimpleName();
			String insertCliente = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, telefono, direccion, comuna, afp, sistemaSalud,	edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			String insertProfesional = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, titulo, fechaIngreso) VALUES (?, ?, ?, ?, ?, ?, ?);";
			String insertAdministrativo = "INSERT INTO usuario (rut, nombres, apellidos, fechaNacimiento, tipoUsuario, area, expPrevia) VALUES (?, ?, ?, ?, ?, ?, ?);";
			try {
				
				if (tipoUsuario.equals("Cliente")) {
					Cliente c = (Cliente) u;	
					PreparedStatement statement = conexion.prepareStatement(insertCliente);
					statement.setString(1, c.getRut());
					statement.setString(2, c.getNombres());
					statement.setString(3, c.getApellidos());
					statement.setDate(4, Date.valueOf(c.getFechaNacimiento()));
					statement.setString(5, "cliente");
					statement.setString(6, c.getTelefono());
					statement.setString(7, c.getDireccion());
					statement.setString(8, c.getComuna());
					statement.setString(9, c.getAfp());
					statement.setString(10, c.getSistemaSalud());
					statement.setInt(11, c.getEdad());
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");
				
				} else if (tipoUsuario.equals("Profesional")) {
					Profesional p = (Profesional) u;
					PreparedStatement statement = conexion.prepareStatement(insertProfesional);
					statement.setString(1, p.getRut());
					statement.setString(2, p.getNombres());
					statement.setString(3, p.getApellidos());
					statement.setDate(4, Date.valueOf(p.getFechaNacimiento()));
					statement.setString(5, "profesional");
					statement.setString(6, p.getTitulo());
					statement.setDate(7, Date.valueOf(p.getFechaIngreso()));
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");

				} else if (tipoUsuario.equals("Administrativo")) {
					Administrativo a = (Administrativo) u;
					PreparedStatement statement = conexion.prepareStatement(insertAdministrativo);
					statement.setString(1, a.getRut());
					statement.setString(2, a.getNombres());
					statement.setString(3, a.getApellidos());
					statement.setDate(4, Date.valueOf(a.getFechaNacimiento()));
					statement.setString(5, "administrativo");
					statement.setString(6, a.getArea());
					statement.setString(7, a.getExpPrevia());
					statement.executeUpdate();
					System.out.println("Registro insertado correctamente");
				}
				
			} catch (SQLException e){
				System.out.println("Ups, hubo un problemita con nuestra BD. Vuelva otro día, gracias :P");
				e.printStackTrace();
			}
		}

		
		// CRU[Delete]
		public void eliminarUsuario(int id) {
    		String consulta = "DELETE FROM usuario WHERE id = ?";

   			try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
        		statement.setInt(1, id);
        		int filasEliminadas = statement.executeUpdate();
        
        		if (filasEliminadas > 0) {
            		System.out.println("Usuario eliminado correctamente.");
        		} else {
            		System.out.println("No se encontró un usuario con el ID especificado.");
        		}
    		} catch (SQLException e) {
        		e.printStackTrace();
    		}
		}

		// Crear conexión: uso privado para devolver instancia/conexión
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
