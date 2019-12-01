package pl.piotrlenar.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.pl.PESEL;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import pl.piotrlenar.model.RefereeDto;

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
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
    private String postalCode;
    private String street;
    private String localNumber;
    private int numberOfMatches;
    private String division;
    private String pesel;
    private String hashedPassword;
    private int phoneNumber;

    @Column(unique = true)
    private String email;

    public Referee(RefereeDto refereeDto) {
        this.firstName = refereeDto.getFirstName();
        this.lastName = refereeDto.getLastName();
        setPassword(refereeDto.getPassword());
        this.dateOfBirth = refereeDto.getDateOfBirth();
        this.city = refereeDto.getCity();
        this.postalCode = refereeDto.getPostalCode();
        this.street = refereeDto.getStreet();
        this.localNumber = refereeDto.getLocalNumber();
        this.numberOfMatches = refereeDto.getNumberOfMatches();
        this.division = refereeDto.getDivision();
        this.pesel = refereeDto.getPesel();
        this.phoneNumber = refereeDto.getPhoneNumber();
        this.email = refereeDto.getEmail();

    }

    public boolean isPasswordCorrect(String candidate) {
        return BCrypt.checkpw(candidate, this.hashedPassword);
    }

    public void setPassword(String password) {
        this.hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
