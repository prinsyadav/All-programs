package org.prince.employee.emp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
@Getter
@Setter


@Table(name = "employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;
    private int salary;
}
