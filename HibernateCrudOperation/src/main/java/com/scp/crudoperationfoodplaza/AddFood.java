package com.scp.crudoperationfoodplaza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.utility.Utility;

public class AddFood{

	public static void main(String[] args) {
		SessionFactory sessionFactory= Utility.getSessionFactory();
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		
		FoodPlaza foodPlaza= new FoodPlaza("Egg Biryani", "Non-Veg", 220);
		session.save(foodPlaza);
		System.out.println("Menu Updated..");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
