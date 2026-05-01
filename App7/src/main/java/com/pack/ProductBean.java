package com.pack;

import java.io.Serializable;

public class ProductBean implements Serializable {
  private String Pcode;
  private String Pname;
  private String Pcompany;
  private String Pprice;
  private String Pqty;
  public String getPcode() {
	return Pcode;
  }
  public void setPcode(String pcode) {
	Pcode = pcode;
  }
  public String getPname() {
	return Pname;
  }
  public void setPname(String pname) {
	Pname = pname;
  }
  public String getPcompany() {
	return Pcompany;
  }
  public void setPcompany(String pcompany) {
	Pcompany = pcompany;
  }
  public String getPprice() {
	return Pprice;
  }
  public void setPprice(String pprice) {
	Pprice = pprice;
  }
  public String getPqty() {
	return Pqty;
  }
  public void setPqty(String pqty) {
	Pqty = pqty;
  }
 public  ProductBean(){
	  
  }
	
	
}
