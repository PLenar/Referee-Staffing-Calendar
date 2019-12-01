package pl.piotrlenar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
public class RefereeDto {

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
    private String password;
    @NotBlank
    private String repeatPassword;

    @NotBlank
    private int phoneNumber;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
}
