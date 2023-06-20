package controlador;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import modelo.*;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet(name="CrearUsuario",urlPatterns = {"/crear-usuario"})
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String id = request.getParameter("id");
		UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
		System.out.println("Testeando crear usuario en la base de datos");
		
		Cliente c = new Cliente("15456789-8", "Pablo", "Pablito", LocalDate.parse("1999-10-25"), "+56912345678", "Las Casas 1234", "Talcahuano", "Modelo", "FONASA", 23);
		Profesional p = new Profesional("15456789-8", "Pablo", "Pablito", LocalDate.parse("1999-10-25"), LocalDate.parse("2021-12-26"), "Arquitecto");
		Administrativo a = new Administrativo("15456789-8", "Pablo", "Pablito", LocalDate.parse("1999-10-25"), "Hotelería", "Muchos años trabajando en de todo un poco...");
		
		usuarioDAO.crearUsuario(c);
		usuarioDAO.crearUsuario(p);
		usuarioDAO.crearUsuario(a);


	//	RequestDispatcher view = request.getRequestDispatcher("views/crearUsuario.jsp");
	//	view.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("rut"));
		System.out.println(request.getParameter("nombre"));
		System.out.println(request.getParameter("apellido"));
		System.out.println(request.getParameter("fechaNaciimiento"));
		
				
		request.setAttribute("returnRut", request.getParameter("rut"));
		request.getRequestDispatcher("views/crearUsuario").forward(request, response);
	}

}
