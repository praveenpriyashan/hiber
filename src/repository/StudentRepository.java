package repository;

import entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;

public class StudentRepository {
    Session session= SessionFactoryConfiguration.getInstance().getSession();

    public Integer saveInteger(StudentEntity entity){
        Transaction transaction=session.beginTransaction();
        try {
            Integer id = (Integer) session.save(entity);
            transaction.commit();
            return id;
        }catch (Exception e){
            transaction.rollback();
            return -1;
        }
    }
}
