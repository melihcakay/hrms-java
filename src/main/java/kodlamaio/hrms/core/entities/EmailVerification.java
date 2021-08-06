package kodlamaio.hrms.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "email_verificatons")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmailVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "verification_code")
    private String code;

    @Column(name = "is_verified")
    private boolean isVerified;

}
