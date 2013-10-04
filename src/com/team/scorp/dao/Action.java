package com.team.scorp.dao;

import com.team.JDO.*;

import java.io.IOException;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletContext application;
	protected PersistenceManager pm;
	
	@SuppressWarnings("rawtypes")
	protected JDO jdo;
	protected static final Logger logger = Logger.getLogger(Action.class.getName());
	
	public abstract void run()throws ServletException, IOException;
	
	public void setRequest(HttpServletRequest request){
		this.request=request;
	}
	
	public void setResponse(HttpServletResponse response){
		this.response=response;
	}
	
	public void setApplication(ServletContext application){
		this.application=application;
	}
	
	public void setPersistenceManager(PersistenceManager model){
		this.pm=model;
	}   
	
}
    