package com.scp.crudoperationfoodplaza;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.utility.Utility;

public class ShowMenu {

	public static void main(String[] args) {
		SessionFactory factory = Utility.getSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from FoodPlaza");
		List<FoodPlaza> listOfFood= query.list();
		for (FoodPlaza foodPlaza : listOfFood) {
			System.out.println("Food id : "+foodPlaza.getFoodId()+ " Food Name: "+foodPlaza.getFoodName()+" Food Type: "+foodPlaza.getFoodType()+" Food Cost: "+foodPlaza.getFoodPrize());
		}
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
