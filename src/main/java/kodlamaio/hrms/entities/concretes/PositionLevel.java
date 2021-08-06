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
@Table(name = "position_level")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisementList"})
public class PositionLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "position_level")
    private String positionLevel;

    @OneToMany(mappedBy = "positionLevel")
    private List<JobAdvertisement> jobAdvertisementList;
}
