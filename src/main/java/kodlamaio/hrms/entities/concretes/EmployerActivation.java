package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer_activations")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerActivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;


    @Column(name = "employer_id")
    private int employerId;


    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "is_verified")
    private boolean isVerified;

}