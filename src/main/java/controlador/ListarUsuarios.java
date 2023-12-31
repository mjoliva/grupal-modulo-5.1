package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import modelo.Usuario;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Administrativo;

/**
 * Servlet implementation class ListarUsuarios
 */
@WebServlet(name="ListarUsuarios",urlPatterns = {"/usuarios"})
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Respondiendo en GET de servlet Listar Usuarios");
		UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
		List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
		request.setAttribute("usuarios", usuarios);
		
		// Solo para debug: 
		for(Usuario u: usuarios) {
			System.out.println(u.toString());
			//System.out.println(u.getClass().getSimpleName());		// obtener constructor para manejar en la vista jsp
		}
		
		
		RequestDispatcher view = request.getRequestDispatcher("views/listarUsuarios.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
