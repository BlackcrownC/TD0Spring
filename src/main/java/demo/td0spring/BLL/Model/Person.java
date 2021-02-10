package demo.td0spring.BLL.Model;

import demo.td0spring.BLL.Model.Enumeration.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String LastName;
    private String FirstName;
    private Long Phone;
    private String Email;

    @Enumerated(EnumType.STRING)
    @NonNull
    private Gender Gender;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address Address;

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                ", Gender=" + Gender +
                ", Address=" + Address +
                '}';
    }
}
