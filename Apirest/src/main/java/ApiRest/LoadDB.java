package ApiRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    //Persistindo dados no banco com jpa
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Log of event sabe user 1: " + employeeRepository.save(new Employee("Maria", "Repositora", "Avenida Silveira Dutra 1002")));
            log.info("Log of event sabe user 2: " + employeeRepository.save(new Employee("John", "Desenvolvedor", "Av Lest 276")));
        };
    }

}
