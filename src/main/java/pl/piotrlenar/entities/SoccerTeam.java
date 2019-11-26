package pl.piotrlenar.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Component
@Table(name = "teams")
public class SoccerTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String division;

    @NotBlank
    private String city;

    @NotBlank
    private String postalCode;

    private String street;

    private String localNumber;
}
