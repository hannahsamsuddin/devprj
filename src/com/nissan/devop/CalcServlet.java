package com.nissan.devop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String s1 = request.getParameter("num1");
		String s2 = request.getParameter("num2");
		
		if(s1 != "" && s2 != "")
		{	
			if(s1.matches(".*\\d+.*") && s2.matches(".*\\d+.*"))
			{
			
				double a1 = Double.parseDouble(s1);
				double a2 = Double.parseDouble(s2);
				Addnum ad = new Addnum();
				double sum = ad.add(a1,a2);
				request.setAttribute("res",sum);
			}
			else
			{
				request.setAttribute("res","!!Please enter numbers!!");
			}
		}
		else
		{
			String result = new String();
			result = "!!Enter values please!!";
			request.setAttribute("res", result);
		}
		request.getRequestDispatcher("ResultPage.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
