package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertisement {

    @Id
    @GeneratedValue

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "company_sector")
    private CompanySector companySector;

    @ManyToOne()
    @JoinColumn(name = "position_level")
    private PositionLevel positionLevel;

    @ManyToOne()
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne()
    @JoinColumn(name = "employment_type")
    private EmploymentType employmentType;

    @ManyToOne()
    @JoinColumn(name = "job_titles_id")
    private Job job;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @NotBlank
    @NotNull
    @Column(name = "job_explanation")
    private String jobExplanation;


    @Column(name = "min_wage")
    private int minWage;

    @Column(name = "max_wage")
    private int maxWage;

    @NotBlank
    @NotNull
    @Column(name = "amount_of_open_positions")
    private int amountOfOpenPositions;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "is_active", columnDefinition = "boolean default true")
    private boolean isActive = true;

}
