package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewproductDAO {
	public ArrayList<ProductBean> retrieveprd() throws SQLException {

	    ArrayList<ProductBean> list = new ArrayList<>();

	    Connection con = DBconnect.getconnect();
	    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM productd");
	    ResultSet rs = pstmt.executeQuery();

	    while (rs.next()) {

	        ProductBean pb = new ProductBean();
	        pb.setPcode(rs.getString("pcode"));
	        pb.setPname(rs.getString("pname"));
	        pb.setPcompany(rs.getString("pcompany"));
	        pb.setPprice(rs.getString("pprice"));
	        pb.setPqty(rs.getString("pqty"));

	        list.add(pb);
	    }
	    System.out.println("Total products: " + list.size());
	    return list;
	   }
		 
	 }
	 

