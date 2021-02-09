package demo.td0spring.BLL.Model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public int CivicNB;
    public String Street;
    public String City;
    public String PostalCode;

}
