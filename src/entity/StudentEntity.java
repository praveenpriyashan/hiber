package entity;

import com.sun.istack.Nullable;
import entity.embeded.StudentName;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.util.List;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = " student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentEntity {


}
