package com.Server.Side.Logic;

import static spark.Spark.*;
import static com.Server.Side.Logic.JsonUtil.*;

public class LoginLogic {
	
	public LoginLogic(final UserServices userServices)
	{
		
		port(8090);
		
		get("/users" , (req, res) -> userServices.getAllUsers(), json());
		
		get("/users/:id" , (req, res) -> "Specific user");
		
		post("/users" , (req, res) -> "Create new user");
		
		put("/users/:id" , (req, res) -> "Update user");
		
		after((req, res) -> {
			  res.type("application/json");
			});
	}
}
