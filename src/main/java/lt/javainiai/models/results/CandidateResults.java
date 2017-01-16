package lt.javainiai.models.results;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lt.javainiai.models.Candidate;

@Data
@Entity
@SuppressWarnings("unused")
public class CandidateResults {
	
	@Id
	@GeneratedValue
	private long candidateResultsId;
	
	private long candidateVoteCount;
	
//	@OneToOne (mappedBy="candidate")
//	private Candidate candidate;
	
}