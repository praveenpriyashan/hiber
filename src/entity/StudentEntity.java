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

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private StudentName studentName ;

    @Column(name = "nic",nullable = false,length = 12)
    @Nullable
    private String nic;

    @ElementCollection
    @CollectionTable(name = "student_mobile",joinColumns = @JoinColumn(name = "student_id"))
    private List<String> mobiles;

    @CreationTimestamp
    @Column(name = "Create_date",nullable = false)
    private Date createDate;



}
