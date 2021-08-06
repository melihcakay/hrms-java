package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employment_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisementList"})
public class EmploymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "employment_type")
    private String employmentType;

    @OneToMany(mappedBy = "employmentType")
    private List<JobAdvertisement> jobAdvertisementList;
}
