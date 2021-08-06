package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "company_sector")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisementList"})
public class CompanySector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "company_sector")
    private String companySectorName;

    @OneToMany(mappedBy = "companySector")
    private List<JobAdvertisement> jobAdvertisementList;
}
