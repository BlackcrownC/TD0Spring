package demo.td0spring.BLL.Model;

import demo.td0spring.BLL.Model.Enumeration.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private AccountType Type;
    private float Balance;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client Client;

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", Type=" + Type +
                ", Balance=" + Balance +
                '}';
    }
}
