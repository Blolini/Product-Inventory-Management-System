package com.pack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class Addproductservlet extends HttpServlet {
  protected void doPost(HttpServletRequest req,HttpServletResponse res){
	  ProductBean pb=new ProductBean();
	  pb.setPcode(req.getParameter("pcode"));
	  pb.setPname(req.getParameter("pname"));
	  pb.setPcompany(req.getParameter("pcompany"));
	  pb.setPprice(req.getParameter("pprice"));
	  pb.setPqty(req.getParameter("pquantity"));
	  
	   AddprdDAO add_prd=new AddprdDAO();
	   int rowcount;
	   try {
	   rowcount =add_prd.insertdata(pb);
	   if(rowcount>0) {
		   req.setAttribute("msg","Product are inserted Successful:)");
		   req.getRequestDispatcher("addproduct.jsp").forward(req, res);
		}
	    else{
			   throw new RuntimeException("Employee Record Not Inserted!!");

	   }
	   }
	   catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   
  }	   
  
}
