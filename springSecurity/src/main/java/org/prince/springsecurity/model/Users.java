package org.prince.springsecurity.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
@Getter
@Setter
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private String country;
    private String filepath;

}
