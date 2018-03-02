package com.scp.crudoperationfoodplaza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.utility.Utility;

public class DeleteMenu {

	public static void main(String[] args) {
		SessionFactory factory = Utility.getSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		FoodPlaza foodPlaza= session.load(FoodPlaza.class, 3);
		session.delete(foodPlaza);
		System.out.println("Food Successfully Delete from Menu Card.");
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
