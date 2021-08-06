package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class Job {

    @Id
    @GeneratedValue

    @Column(name = "id")
    private int id;

    @Column(name = "title")
    @NotBlank
    @NotNull
    private String title;

    @OneToMany(mappedBy = "job")
    private List<JobAdvertisement> jobAdvertisements;
}

