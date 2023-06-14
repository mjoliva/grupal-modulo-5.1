package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/grupal-modulo-5/views/contacto.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//verificar que el usuario ingresado sea igual a “admin” y que la clave sea igual a “1234”.
				HttpSession session = request.getSession();
				String usuario = request.getParameter("rut");
				String password = request.getParameter("password");
				// si valida correctamente, a Inicio
				if(usuario.equals("admin") && password.equals("1234")) {
					session.setAttribute("usuario", usuario);
					session.setAttribute("password", password);
					RequestDispatcher view = request.getRequestDispatcher("/grupal-modulo-5/views/contacto.jsp");
					view.forward(request, response);	
				} else {
					System.out.println("usuario incorrecto");
					doGet(request, response);	
				}

	}

}
