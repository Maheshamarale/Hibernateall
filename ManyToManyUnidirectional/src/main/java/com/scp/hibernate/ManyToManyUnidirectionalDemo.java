package com.scp.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scp.hibernate.entity.Student;
import com.scp.hibernate.entity.Subjects;
import com.scp.hibernate.util.HibernateUtil;

public class ManyToManyUnidirectionalDemo 
{
    public static void main( String[] args )
    {
    	Student student = new Student("Student" ,"1" );
    	Student student2 = new Student("Student","2");
    	
    	 Subjects subject1 = new Subjects("Sub1");
         Subjects subject2 = new Subjects("Sub2");
         Subjects subject3 = new Subjects("Sub3");
         
         student.getSubjects().add(subject1);
         student.getSubjects().add(subject2);
         
         student2.getSubjects().add(subject2);
         student2.getSubjects().add(subject3);
         
         
         SessionFactory factory = HibernateUtil.getSessionFactory();
         Session session = factory.openSession();
         org.hibernate.Transaction transaction = session.beginTransaction();
         
         session.persist(student);
         session.persist(student2);
         
         transaction.commit();
         session.close();
         
    	
    }
}
