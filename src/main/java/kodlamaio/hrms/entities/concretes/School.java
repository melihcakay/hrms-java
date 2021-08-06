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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schools")
public class School {

    @Id
    @GeneratedValue

    @Column(name = "id")
    private int id;

    @NotBlank
    @NotNull
    @Column(name = "school_name")
    private String schoolName;

    @NotBlank
    @NotNull
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @NotBlank
    @NotNull
    @Column(name = "graduate_date")
    private LocalDateTime graduateDate;

    @ManyToOne()
    @JoinColumn(name = "cv_id")
    private CurriculumVitae curriculumVitae;

}
