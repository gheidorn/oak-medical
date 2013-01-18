package com.om;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Oak_medicalServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		
		System.out.println("servlet");
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
