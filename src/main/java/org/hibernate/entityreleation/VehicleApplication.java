package org.hibernate.entityreleation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.core.HibernateUtil;

public class VehicleApplication {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Vehichle vehichle=new Vehichle();
        Registration registration=new Registration();

        vehichle.setMake("Ford");
        vehichle.setModel("Endeavour");
        vehichle.setClassOfVehichle("4 wheel gear");

        registration.setOwner("Sujeet");
        registration.setRegistrationNumber("EA34TUSN335ND");

        vehichle.setRegistration(registration);

        registration.setVehichle(vehichle);

        session.save(vehichle);
        transaction.commit();

        session.evict(vehichle);
        session.evict(registration);

        session.merge(vehichle);
        session.merge(registration);
        Vehichle emp= (Vehichle) session.get(Vehichle.class, registration.getVehichle().getId());
        System.out.println(emp.getRegistration());
    }

}
