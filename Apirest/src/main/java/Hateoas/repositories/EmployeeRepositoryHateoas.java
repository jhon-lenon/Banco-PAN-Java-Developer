package Hateoas.repositories;

import Hateoas.entitys.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryHateoas extends JpaRepository<EmployeeHateoas, Long> {

}
