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
            System.out.println("Writing object to database ...");
            Student tempStudent = new Student("Adam" , "G." ,"iloveprogramming@java.com");

            session.beginTransaction();
            session.save(tempStudent);
            session.getTransaction().commit();


        }finally {
            sessionFactory.close();
        }


    }
}
