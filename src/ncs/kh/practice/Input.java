package ncs.kh.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.input")
public class Input extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String ctxPath = request.getContextPath();
	String reqUri = request.getRequestURI();
	String command = reqUri.substring(ctxPath.length());
	
	if(command.equals("/input.input")) {
		String text = request.getParameter("text");
		System.out.println(text);
		request.setAttribute("result", text);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
