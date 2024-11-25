package org.prince.springsecurity.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.io.File;

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
    private int id;
    private String username;
    private String password;
    private String email;
    private String country;
    private String filepath;

}
