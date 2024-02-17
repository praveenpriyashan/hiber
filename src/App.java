import entity.StudentEntity;
import entity.embeded.StudentName;
import org.hibernate.Session;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) {
        StudentRepository studentRepository=new StudentRepository();
        StudentEntity entity=new StudentEntity();
        entity.setNic("963100175v");

        StudentName studentName=new StudentName();

    }
}
