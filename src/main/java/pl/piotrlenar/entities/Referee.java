package pl.piotrlenar.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.pl.PESEL;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Component
@Table(name = "referees")
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private LocalDate dateOfBirth;

    @NotBlank
    private String city;

    @NotBlank
    private String postalCode;

    private String street;

    private String localNumber;

    private int numberOfMatches;

    @NotBlank
    private String division;

    @PESEL
    private String pesel;

    @NotBlank
    private String hashedPassword;

    @NotBlank
    @Email
    private String email;

    public boolean isPasswordCorrect(String candidate) {
        return BCrypt.checkpw(candidate, this.hashedPassword);
    }

    public void setPassword(String password) {
        this.hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
