package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class Employer extends User {

    @Column(name = "company_name")
    @NotBlank
    @NotNull
    private String companyName;

    @Column(name = "website_address")
    @NotBlank
    @NotNull
    private String websiteAddress;

    @Column(name = "phone_number")
    @NotBlank
    @NotNull
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;

}
