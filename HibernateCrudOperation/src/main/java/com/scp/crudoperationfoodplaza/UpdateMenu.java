package com.scp.crudoperationfoodplaza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.utility.Utility;

public class UpdateMenu {

	public static void main(String[] args) {
		SessionFactory factory = Utility.getSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		FoodPlaza foodPlaza= session.get(FoodPlaza.class, 3);
		foodPlaza.setFoodName("Cheez Pizza");
		System.out.println("Menu Updated");
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
