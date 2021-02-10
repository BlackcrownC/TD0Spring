package demo.td0spring.BLL.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Getter
@Setter

@Entity
@Table(name = "Manager")
public class AccountManager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private short OfficeNB;
    private String Password;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Client> clients;
    @OneToOne(cascade = CascadeType.ALL)
    private Person Person;

    @Override
    public String toString() {
        return "AccountManager{" +
                "Id=" + Id +
                ", OfficeNB=" + OfficeNB +
                ", Password='" + Password + '\'' +
                ", clients=" + clients +
                ", Person=" + Person +
                '}';
    }
}
