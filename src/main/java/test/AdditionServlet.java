package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/add")
@SuppressWarnings("serial")
public class AdditionServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		int v1 = Integer.parseInt(req.getParameter("v1"));
		int v2 = Integer.parseInt(req.getParameter("v2"));
		int v3 = v1 + v2;
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Sum:"+v3+"<br>");
		
		RequestDispatcher rd = req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}

}
