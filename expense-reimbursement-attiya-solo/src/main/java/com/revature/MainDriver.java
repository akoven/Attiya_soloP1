package com.revature;

import com.revature.controller.RequestHandler;

import io.javalin.Javalin;

public class MainDriver {
	public static void main(String[] args) {
		
		Javalin app = Javalin.create(config -> config.addStaticFiles(staticFiles -> {staticFiles.directory = "/public";})).start(9000);
 		RequestHandler.defineEndpoints(app);
		
		app.get("/", ctx -> ctx.redirect("/preLogin.html"));
		
//		ReimbursementDAOImplimentation r = new ReimbursementDAOImplimentation();
//		r.removeRequest("test", 1);
		
	}

}
