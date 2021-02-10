package demo.td0spring.BLL.Model;

import demo.td0spring.BLL.Model.Enumeration.MaritalStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter

@Entity
@Table(name = "Client")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private float Salary;

    @Enumerated(EnumType.STRING)
    @NonNull
    private MaritalStatus MaritalStatus;
    private short BirthYear;
    private short NIP; // 4 digits

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Account> Accounts;

    @ManyToOne(cascade = CascadeType.ALL)
    private AccountManager AccountManager;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", Salary=" + Salary +
                ", MaritalStatus=" + MaritalStatus +
                ", BirthYear=" + BirthYear +
                ", NIP=" + NIP +
                ", Accounts=" + Accounts +
                ", AccountManager=" + AccountManager +
                ", person=" + person +
                '}';
    }
}
