package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "curriculumVitaes"})
public class Candidate extends User {

    @Column(name = "first_name")
    @NotBlank
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotBlank
    @NotNull
    private String lastName;

    @Column(name = "date_of_birth")
    @NotBlank
    @NotNull
    private LocalDateTime dateOfBirth;

    @Column(name = "national_id")
    @NotBlank
    @NotNull
    private String nationalId;

    @OneToMany(mappedBy = "candidate")
    private List<CurriculumVitae> curriculumVitaes;




}
