package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddprdDAO {
  public int insertdata(ProductBean pb){
	  Connection con=DBconnect.getconnect();
	  int rowcount=0;
	  try {
		  PreparedStatement pstmt=con.prepareStatement("insert into productd(pcode,pname,pcompany,pprice,pqty) values(?,?,?,?,?)");
		  pstmt.setString(1, pb.getPcode());
		  pstmt.setString(2, pb.getPname());
		  pstmt.setString(3, pb.getPcompany());
		  pstmt.setString(4, pb.getPprice());
		  pstmt.setString(5, pb.getPqty());
		   rowcount=pstmt.executeUpdate();
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
	return rowcount;
	   
   }
}
