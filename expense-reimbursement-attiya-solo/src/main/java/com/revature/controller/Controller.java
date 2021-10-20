package com.revature.controller;

import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Request;
import com.revature.repo.ReimbursementDAOImpl;

import io.javalin.Javalin;

public class Controller implements ControllerInterface{
	
	 static ReimbursementDAOImpl reimburse = new ReimbursementDAOImpl();

	public boolean connect() {
		// TODO Auto-generated method stub
	
		return false;
	}
	
	public String authenticateLogin(Context ctx) {
		// TODO Auto-generated method stub
//		System.out.println(ctx.queryParam("username"));
//		System.out.println(ctx.queryParam("password"));
	
		String page = "";
//		for(int i = 0; i<9; i++)
		if(ctx.queryParam("username").equals("user") && ctx.queryParam("password").equals("p4ss")){
					page = "loginPage.html";
				}else {
					page = "failedLogin.html";
				}
		
		return page;
	}
	
	public boolean checkRequestStatus(Context ctx) {

		String employeeId = ctx.pathParam("id");
		String requestStatus = ctx.pathParam("requestStatus");
		
		int id = Integer.parseInt(employeeId);
		
		boolean status = reimburse.checkRequestStatus(requestStatus, id);

		return status;
	}
	
	public void viewAllRequestsByType(Context ctx) {
		
		String requestType = ctx.pathParam("requestType");
		List<Request> requestList = new ArrayList<>();
		
		requestList = reimburse.getAllRequestsByType(requestType);
		
		
	}
	
	

}