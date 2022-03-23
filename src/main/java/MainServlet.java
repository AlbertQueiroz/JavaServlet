

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;
import utils.Codable;


/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		GET PARAMETERS INDIVIDUALLY:
		Enumeration<String> parameters = request.getParameterNames();
		while (parameters.hasMoreElements()) {
			String parameterKey = (String) parameters.nextElement();
			String parameterValue = request.getParameter(parameterKey);
		}
		*/
		
		
		// URL Example: http://localhost:8081/Servlet/MainServlet?model=Gol&year=2020&brand=VW
		PrintWriter out = response.getWriter();
		
		Car car = new Car();
		Codable.encode(car, request.getParameterMap());
		
		// HTML
		out.println("<html>");
		out.println("<h1>Resultados da Busca</h1>");
		out.println(
				"<h2>"
				+ "Modelo:"
				+ car.getModel()
				+ "</h2>"
				+ "<h2>"
				+ "Marca:"
				+ car.getBrand()
				+ "</h2>"
				+"<h2>"
				+ "Ano:"
				+ car.getYear()
				+ "</h2>"
				);
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
