package Controller;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;
import Model.porder;

/**
 * Servlet implementation class addController
 */
@WebServlet("/addController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String desk = request.getParameter("desk");
		Integer A = Integer.parseInt(request.getParameter("A"));
		Integer B = Integer.parseInt(request.getParameter("B"));
		Integer C =Integer.parseInt(request.getParameter("C"));
		
		porder p = new porder(desk, A, B, C);
		new porderDao().add(p);
		
		response.sendRedirect("finish.jsp");
		
	}

}
