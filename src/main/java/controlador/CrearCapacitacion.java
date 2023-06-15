package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/crear-capacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/crearCapacitacion.jsp");
		view.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Hola en Crear capacitacion con POST");
		
		System.out.println(request.getParameter("rut"));
		System.out.println(request.getParameter("dia"));
		System.out.println(request.getParameter("date"));
		System.out.println(request.getParameter("hour"));
		System.out.println(request.getParameter("lugar"));
		System.out.println(request.getParameter("duracion"));
		System.out.println(request.getParameter("asistentes"));
				
		request.setAttribute("returnRut", request.getParameter("rut"));
		request.getRequestDispatcher("views/crearCapacitaciones").forward(request, response);
	}

}
