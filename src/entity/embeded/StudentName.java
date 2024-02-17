package entity.embeded;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@ToString 
@Embeddable
public class StudentName {

    @Column(name = "first_name",length = 100,nullable = false)
    private  String firstName;

    @Column(name = "last_name",length = 100,nullable = false)
    private String lastNAme;
}
