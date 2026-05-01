package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
  static Connection con=null;
  static {
	  try {
		  Class.forName(DBInfo.driver);
		 con= DriverManager.getConnection(DBInfo.dburl, DBInfo.dbuname, DBInfo.dbpwd);
	  }
	  catch(Exception e) {
		  System.out.println("There is a probelm in dBconnect");
		  e.printStackTrace();
	  }
  }
  public static Connection getconnect() {
	return con;
	  
  }
}
