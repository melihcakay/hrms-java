package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {

    @Query("Select new kodlamaio.hrms.entities.dtos.CurriculumVitaeWithCandidateDto(cv.id,c.firstName,c.lastName,cv.githubLink,cv.linkedLink,cv.coverLetter,cv.cvStatus) " +
            "From Candidate c Inner Join c.curriculumVitaes cv")
    List<CurriculumVitaeWithCandidateDto> getCurriculumVitaeWithCandidateDetails();

    CurriculumVitae getByCandidate_NationalIdAndCandidate_FirstName(String nationalId,String firstName);
}
