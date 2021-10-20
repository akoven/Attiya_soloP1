package com.revature.controller;

import io.javalin.http.Context;

public interface ControllerInterface {
	
	
	public boolean connect();
	
	public String authenticateLogin(Context ctx);
	
	public boolean checkRequestStatus(Context ctx);
	
	public void viewAllRequestsByType(Context ctx);


}
