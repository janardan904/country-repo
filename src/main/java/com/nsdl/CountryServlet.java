package com.nsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1040648506089647738L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String StatesIndia[]= {"AP","MH","TS","UP","MP"};
		String UsStates[]= {"CA","LA","NY","CR","AZ"};
		String ausisStates[]= {"Tms","BB","CBR","CBR"};
		String country;
		
		
		//read form data
		country=req.getParameter("country");
		System.out.println("country::::"+country);
		//general setting
		PrintWriter pw=null;
		pw=res.getWriter();
		
		//set content type
		res.setContentType("text/html");
   //get states based on the country that is selected
		if(country.equals("india")) {
			pw.println("States="+Arrays.toString(StatesIndia));
			
			
		}
		else if(country.equals("us")){
			pw.println("States="+Arrays.toString(UsStates));
			
				}
		else {
			pw.println("States="+Arrays.toString(ausisStates));
		
		
	}
		pw.close();
	
	}


	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	
}