import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import java.util.List;


public class GetStudentClass {
    public static void main(String[] args){
        SessionFactory sessionFactory  =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try{

            System.out.println("Reading object from DB with id = 0");
            session.beginTransaction();
            Student s = session.get(Student.class,0);
            System.out.println(s);
            //session.getTransaction().commit();

            System.out.println("Get All students");


            List<Student> studentList = session.createQuery("from Student").list();
            for (Student tmpStudent:studentList){
                System.out.println(tmpStudent);

            }


            System.out.println("Get users, who name is not'Adam'");

            List<Student> studentList1 = session.createQuery("FROM Student t where t.firstName <>'Adam'").list();


            for (Student tmpStudent:studentList1){
                System.out.println(tmpStudent);
            }

            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }
    }
}
