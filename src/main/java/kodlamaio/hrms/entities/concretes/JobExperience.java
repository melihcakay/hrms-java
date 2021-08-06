package kodlamaio.hrms.entities.concretes;

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
@Table(name = "job_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @NotBlank
    @NotNull
    @Column(name = "workplace_name")
    private String workplaceName;

    @NotBlank
    @NotNull
    @Column(name = "position")
    private String position;

    @NotBlank
    @NotNull
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @NotBlank
    @NotNull
    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne()
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;
}
