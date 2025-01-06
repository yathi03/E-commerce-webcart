 package com.webapp.servlet;

 import java.io.BufferedReader;
 import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.json.JSONArray;
 import org.json.JSONObject;

import com.webapp.dao.Product_Impl;
import com.webapp.dto.ProductDTO;


@WebServlet("/Run")
public class Run extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String jsonData = sb.toString();

        // Parse JSON data
        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray items = jsonObject.getJSONArray("items");
        double total = jsonObject.getDouble("total");

        ProductDTO pd=new ProductDTO();
        for (int i = 0; i < items.length(); i++) {
        	double totalprice=0;
            JSONObject item = items.getJSONObject(i);
            String name = item.getString("name");
            double price = item.getDouble("price");
            totalprice+=price;
            
            pd.setPname(name);
            pd.setPrice(price);
            pd.setTotalprice(totalprice);
            
            
            Product_Impl pi=new Product_Impl();
            
            
            Boolean result=pi.addProduct(pd);
            
           if(result)
           {
        	   System.out.println("Added");
           }
           else
           {
        	   System.out.println("Error");
           }
           
        }
       
        // Send a response back to the client
        response.setContentType("application/json");
        response.getWriter().write("{\"status\":\"success\"}");
        
        
        
        

    }
	
	}


