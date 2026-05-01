package com.pack;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	
    	ViewproductDAO db=new ViewproductDAO();
    	try {
    		ArrayList<ProductBean> list=db.retrieveprd();
    		request.setAttribute("product", list);
    		RequestDispatcher rs=request.getRequestDispatcher("view.jsp");
    		rs.forward(request, response);
    		
    		request.setAttribute("msg", "Unable to fetch products");
            RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
            rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
}
