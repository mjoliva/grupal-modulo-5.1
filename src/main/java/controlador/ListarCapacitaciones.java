package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapacitacionDAO;
import modelo.Capacitacion;

/**
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet(name="ListarCapacitaciones",urlPatterns = {"/capacitaciones"})
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Respondiendo en GET de servlet Listar Capacitaciones");
		CapacitacionDAO capacitacionDAO = CapacitacionDAO.getInstancia();
        
        List<Capacitacion> capacitaciones = capacitacionDAO.obtenerCapacitaciones();
        
        request.setAttribute("capacitaciones", capacitaciones);
        RequestDispatcher view = request.getRequestDispatcher("views/listarCapacitaciones.jsp");
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
