package demo.td0spring.BLL.Model;

import demo.td0spring.BLL.Model.Enumeration.MaritalStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter

@Entity
@Table(name = "client")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private float Salary;
    @Enumerated(EnumType.STRING)
    private MaritalStatus MaritalStatus;
    private short BirthYear;
    private short NIP; // 4 digits

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Account> Accounts;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
}
