package util;

import entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(StudentEntity.class);
        sessionFactory =configuration.buildSessionFactory();
    }
    public static SessionFactoryConfiguration getInstance(){
        if (sessionFactoryConfiguration==null){
            sessionFactoryConfiguration=new SessionFactoryConfiguration();
        }
        return sessionFactoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
