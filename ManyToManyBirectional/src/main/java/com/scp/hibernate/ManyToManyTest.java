package com.scp.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.hibernate.entity.Student;
import com.scp.hibernate.entity.Subjects;
import com.scp.hibernate.util.HibernateUtil;

public class ManyToManyTest {
	public static void main(String[] args) {
		Student student1 = new Student("MAhii", "111");
		Student student2 = new Student("Arya", "222");

		Subjects subject1 = new Subjects("SUB1");
		Subjects subject2 = new Subjects("SUB2");
		Subjects subject3 = new Subjects("SUB3");

		student1.getSubjects().add(subject1);
		student1.getSubjects().add(subject2);

		student2.getSubjects().add(subject2);
		student2.getSubjects().add(subject3);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();

		session.persist(student1);
		session.persist(student2);

		transaction.commit();
		session.close();

	}
}
