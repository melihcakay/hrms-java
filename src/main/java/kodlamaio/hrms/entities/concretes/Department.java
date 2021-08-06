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
@Table(name = "department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisementList"})
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "department")
    private List<JobAdvertisement> jobAdvertisementList;
}
