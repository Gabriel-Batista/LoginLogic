package com.Server.Side.Logic;

import java.util.LinkedList;
import java.util.List;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class UserServices {
	
	public List<String> getAllUsers()
	{
		
		MongoClient mongoClient = new MongoClient("localhost", 8090);
		MongoDatabase db = mongoClient.getDatabase("test");
		MongoCollection<Document> collection = db.getCollection("test");
		List<String> users = new LinkedList<String>();
		users.add(collection.find().first().toJson());
		/*
		
		
		
		System.out.println("The connection was established.");*/
		
		return users;
		
	}
	
	public User getUser(String id)
	{
		
		return null;
		
	}
	
	public User createUser(String username, String password)
	{
		
		return null;
		
	}
	
	public User updateUser(String id, String username, String password)
	{
		
		return null;
		
	}
	
}
