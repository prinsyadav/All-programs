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
    private int id;
    private String username;
    private String password;
    private String email;
    private String country;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "image_data", columnDefinition = "bytea")
    private byte[] imageData;

    public byte[] getImage() {
        return imageData;
    }
}
