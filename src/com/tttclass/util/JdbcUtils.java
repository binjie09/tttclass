package com.tttclass.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties; 

public class JdbcUtils { 
	    private static String url;
		private static String username;
		private static String password;
		private static ThreadLocal<Connection> conList = new ThreadLocal<Connection>(); 
		static { 
		    	try{
		    		InputStream is = JdbcUtils.class.getResourceAsStream("/com/tttclass/util/jdbc.properties");
		    	    Properties prop = new Properties();
		    	    prop.load(is);
		    	    String driver = prop.getProperty("jdbc.driver");
		    	    url = prop.getProperty("jdbc.url");
		    	    username = prop.getProperty("jdbc.username");
		    	    password = prop.getProperty("jdbc.password");
		    	    Class.forName(driver); 
		    	}catch(Exception e){
		    		throw new RuntimeException(e);
		    	}
		    }  
		    
		    public static Connection  getConnection() throws SQLException, ClassNotFoundException, IOException { 				
		   	 Connection con = conList.get();
		   	 if(con == null){
		   		 try {
		   			con = DriverManager.getConnection(url,username,password);  
		   		    conList.set(con);
		   		} catch (Exception e) { 
		   			throw new RuntimeException(e);
		   		} 
		   	 } 
		   	 return con;
		   	}  
}
