package org.hibernate.core;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {

    public static void main(String[] args) {
//        Session session =HibernateUtil.getSessionFactory().openSession();
//        Transaction tx=session.beginTransaction();
//        DemoApp demoApp=new DemoApp();
//        demoApp.setName("Devansu");
//        session.save(demoApp);
//
//        childOne childOne=new childOne();
//        childOne.setCompany("Google");
//        Parent parentOne=new Parent();
//        parentOne.setName("Devansu");
//        parentOne.setAddress("munnekolala, marathalli");
//        parentOne.setEmail("devansu1991@gmail.com");
//        parentOne.setchildOne(childOne);
//        childOne.setParent(parentOne);
//        session.save(parentOne);
//        tx.commit();
////        session.close();
//        Parent emp= (Parent) session.get(Parent.class, childOne.getParent().getId());
//
        Session sessionOne =HibernateUtil.getSessionFactory().openSession();
        Transaction txOne=sessionOne.beginTransaction();
//        DemoApp demoApp=new DemoApp();
//        demoApp.setName("Devansu");
//        session.save(demoApp);

        Child childOne=new Child();
        childOne.setCompany("MicroSoft");
        Parent parentOne=new Parent();
        parentOne.setName("Regina Philangie");
        parentOne.setAddress("NY, USA");
        parentOne.setEmail("regina@gmail.com");
        parentOne.setChild(childOne);
        childOne.setParent(parentOne);
        sessionOne.save(parentOne);
        txOne.commit();
        sessionOne.close();
//        System.out.println(emp.getName());
    }
}
