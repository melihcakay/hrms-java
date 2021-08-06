package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "curriculum_vitaes")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "schools", "jobExperiences", "technologies", "languages","candidates"})

public class CurriculumVitae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @NotBlank
    @NotNull
    @Column(name = "photo")
    private String photo;

    @NotBlank
    @NotNull
    @Column(name = "github_link")
    private String githubLink;

    @NotBlank
    @NotNull
    @Column(name = "linked_link")
    private String linkedLink;

    @NotBlank
    @NotNull
    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "cv_status")
    private boolean cvStatus;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<School> schools;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<Technology> technologies;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<Language> languages;
}
