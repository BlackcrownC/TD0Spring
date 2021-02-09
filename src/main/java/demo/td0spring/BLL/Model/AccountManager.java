package demo.td0spring.BLL.Model;

import java.util.*;

public class AccountManager extends Person {
    public List<Client> clients;
    public short OfficeNB;
    public String Password;

    public AccountManager(int id, String lastName, String firstName, long phone, String email, char gender, Address address, short officeNB, String password) {
        super(id, lastName, firstName, phone, email, gender, address);
        OfficeNB = officeNB;
        Password = password;
        this.clients = new ArrayList<>();
    }

    public AccountManager(String lastName, String firstName, long phone, String email, char gender, Address address, short officeNB, String password) {
        super(lastName, firstName, phone, email, gender, address);
        OfficeNB = officeNB;
        Password = password;
        this.clients = new ArrayList<>();
    }
}
