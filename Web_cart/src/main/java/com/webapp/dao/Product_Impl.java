package com.webapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

import com.sql.connector.Connectionfactory;
import com.webapp.dto.ProductDTO;

public class Product_Impl implements ProductDAO {
	
	
	ProductDTO p;
	private Connection con;
	int res=0;
	
	
	public Product_Impl()
	{
		
	this.con=Connectionfactory.requestConnection();
	
	}

	

	public boolean addProduct(ProductDTO product)
	{
		PreparedStatement ps=null;
		try {
		ps=con.prepareStatement("INSERT INTO PRODUCTS VALUES (?,?,?)");
		ps.setString(1,product.getPname());
		ps.setDouble(2,product.getPrice());
		ps.setDouble(3,product.getTotalprice());
		res=ps.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		if(res>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
		
	}
	
    public List<ProductDTO> getAllProducts(){
		
    	return null;
    	
    }
	
	
}
