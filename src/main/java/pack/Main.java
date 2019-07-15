package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args){
        SessionFactory sessionFactory  =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try{
            Student student = new Student("Asd","aa","asdas@wp.pl");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }


    }
}
