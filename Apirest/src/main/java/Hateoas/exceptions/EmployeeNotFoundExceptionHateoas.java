package Hateoas.exceptions;

public class EmployeeNotFoundExceptionHateoas extends RuntimeException{
    public EmployeeNotFoundExceptionHateoas(long id){
        super("Could not found the employee: "+id);
    }
}
