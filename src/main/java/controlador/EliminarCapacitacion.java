package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapacitacionDAO;
import modelo.Capacitacion;

/**
 * Servlet implementation class EliminarCapacitacion
 */
@WebServlet("/eliminar-capacitacion")
public class EliminarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionDAO capacitacionDao = CapacitacionDAO.getInstancia();
		String idCapacitacion = request.getParameter("idCapacitacion");
		capacitacionDao.eliminarCapacitacion(idCapacitacion);
		
		request.getRequestDispatcher("views/listarrCapacitacion.jsp").forward(request, response);

	}

}
