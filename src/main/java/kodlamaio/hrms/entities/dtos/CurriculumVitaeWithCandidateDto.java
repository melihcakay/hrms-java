package kodlamaio.hrms.entities.dtos;

import kodlamaio.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitaeWithCandidateDto {


    private int id;
    private String firstName;
    private String lastName;
    private String githubLink;
    private String linkedLink;
    private String coverLetter;
    private boolean cvStatus;



}
