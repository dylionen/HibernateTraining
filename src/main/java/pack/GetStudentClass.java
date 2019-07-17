package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetStudentClass {
    public static void main(String[] args){
        SessionFactory sessionFactory  =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try{
            System.out.println("Reading object from DB");
            session.beginTransaction();

            Student s = session.get(Student.class,0);
            System.out.println(s);

            session.getTransaction().commit();




        }finally {
            sessionFactory.close();
        }

    }
}
