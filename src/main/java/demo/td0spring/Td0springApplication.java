package demo.td0spring;

import demo.td0spring.DAL.services.impl.AccountManagerServiceImpl;
import demo.td0spring.DAL.services.impl.ClientServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Td0springApplication {

    private final Logger log = LoggerFactory.getLogger(Td0springApplication.class);

    @Autowired
    private ClientServiceImpl clientService;

    @Autowired
    private AccountManagerServiceImpl accountManagerService;

    public static void main(String[] args) {
        SpringApplication.run(Td0springApplication.class, args);
    }

}
